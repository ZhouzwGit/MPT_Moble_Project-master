package com.mpt.hxqh.mpt_project.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/22.
 * 实际物料
 */

public class MATUSETRANS implements Serializable {
    public String ITEMNUM;//ITEMNUM
    public String POSITIVEQUANTITY;//POSITIVEQUANTITY
    public String STORELOC;//STORELOC

    public String getITEMNUM() {
        return ITEMNUM;
    }

    public void setITEMNUM(String ITEMNUM) {
        this.ITEMNUM = ITEMNUM;
    }

    public String getPOSITIVEQUANTITY() {
        return POSITIVEQUANTITY;
    }

    public void setPOSITIVEQUANTITY(String POSITIVEQUANTITY) {
        this.POSITIVEQUANTITY = POSITIVEQUANTITY;
    }

    public String getSTORELOC() {
        return STORELOC;
    }

    public void setSTORELOC(String STORELOC) {
        this.STORELOC = STORELOC;
    }
}
