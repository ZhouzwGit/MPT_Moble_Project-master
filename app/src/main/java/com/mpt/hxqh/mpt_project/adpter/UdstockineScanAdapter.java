package com.mpt.hxqh.mpt_project.adpter;

import android.animation.Animator;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mpt.hxqh.mpt_project.R;
import com.mpt.hxqh.mpt_project.model.UDSTOCKTLINE;
import com.mpt.hxqh.mpt_project.ui.widget.BaseViewHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by apple on 15/10/26
 * 物料盘点行适配器
 */
public class UdstockineScanAdapter extends BaseQuickAdapter<UDSTOCKTLINE> {
    private static final String TAG = "UdstockineScanAdapter";
    private int position;
    Map<String,String> map = new HashMap<>();

    public UdstockineScanAdapter(Context context, int layoutResId, List data) {
        super(context, layoutResId, data);
    }

    @Override
    protected void startAnim(Animator anim, int index) {
        super.startAnim(anim, index);
        position = index;
        if (index < 5)
            anim.setStartDelay(index * 150);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final UDSTOCKTLINE item) {
        Log.i(TAG, "item=" + item.getUDSTOCKTLINEID());

        if (item.getSTKRESULT().equals("MATCH")) {
            helper.setBackgroundRes(R.id.card_container, R.color.blue);
        } else {
            helper.setBackgroundRes(R.id.card_container, R.color.white);
        }
        String sn = item.getSERIALNUM();
        helper.setText(R.id.item_text_id, item.getASSETNUM());
        helper.setText(R.id.sn_text_id, item.getSERIALNUM());
        helper.setText(R.id.new_sn_text_id, item.getCHECKSERIAL());
        helper.setText(R.id.QTY_text_id, item.getQUANTITY());
        helper.setText(R.id.quantiy_text_id,item.getQTYINSTK());
        if (sn != null && !sn.equals("") && sn.equals(item.getCHECKSERIAL())){
            item.setSTKRESULT("MATCH");
            item.setISSCAN(1);
        }
        helper.setText(R.id.stkresult_text_id,item.getSTKRESULT());
        helper.setText(R.id.stockremark_text_id,item.getREMARK());
        final EditText t = (EditText) helper.getView(R.id.new_sn_text_id);
        final EditText r = (EditText) helper.getView(R.id.stockremark_text_id);
        final EditText p = (EditText) helper.getView(R.id.quantiy_text_id);
        t.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                boolean flag = false;
                List<UDSTOCKTLINE> data = getData();
                String assetnum = null;
                String sn = null;
                String thisnum = ((TextView)helper.getView(R.id.item_text_id)).getText().toString();
                for (int i = 0;i<data.size();i++){
                    assetnum = data.get(i).getASSETNUM();
                    sn = data.get(i).getSERIALNUM();
                    if (assetnum!=null && assetnum.equals(thisnum)){
                        if (sn != null && !sn.equals("") && sn.equals(s.toString())) {
                            data.get(i).setCHECKSERIAL(s.toString());
                            data.get(i).setSTKRESULT("MATCH");
                            helper.setText(R.id.stkresult_text_id,"MATCH");
                            Log.e("SN IN STOCKTAKING", s.toString());
                        }else if (s.toString()!=null && !s.toString().equals("")){
                            data.get(i).setCHECKSERIAL(s.toString());
                            data.get(i).setSTKRESULT("NOT MATCH");
                            helper.setText(R.id.stkresult_text_id,"NOT MATCH");
                        }else {
                            data.get(i).setSTKRESULT("");
                            helper.setText(R.id.stkresult_text_id, data.get(i).getSTKRESULT());
                        }
                    }
                }
            }
        });
        r.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                List<UDSTOCKTLINE> data = getData();
                String assetnum = null;
                String thisnum = ((TextView)helper.getView(R.id.item_text_id)).getText().toString();
                for (int i = 0;i<data.size();i++){
                    assetnum = data.get(i).getASSETNUM();
                    if (assetnum!=null && assetnum.equals(thisnum)){
                        data.get(i).setREMARK(s.toString());
                        Log.e("REMARK",s.toString());
                    }
                }
            }
        });
        p.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                List<UDSTOCKTLINE> data = getData();
                String assetnum = null;
                String thisnum = ((TextView)helper.getView(R.id.item_text_id)).getText().toString();
                for (int i = 0;i<data.size();i++){
                    assetnum = data.get(i).getASSETNUM();
                    if (assetnum!=null && assetnum.equals(thisnum)){
                        data.get(i).setQTYINSTK(s.toString());
                        Log.e("QUANTITY",s.toString());
                    }
                }
            }
        });
    }


}
