package com.mpt.hxqh.mpt_project.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/3/22.
 * 物料盘点行
 */

public class UDSTOCKTLINE implements Serializable {
    public String STOCKTNUM;//STOCKTNUM
    public String ASSETNUM;//ASSETNUM
    public String ITEMNUM;//ITEMNUM
    public String CATEGORY;//CATEGORY
    public String CONFIGURE;//CONFIGURE
    public String CHECKSERIAL;//CHECKSERIAL
    public String PHASE;//PHASE
    public String REMARK;//REMARK
    public String LINE;//LINE
    public String SERIALNUM;//SERIALNUM
    public String ISCHECK;//ISCHECK
    public int ISSCAN;//ISSCAN
    public String UDSTOCKTLINEID;//UDSTOCKTLINEID
    public String QUANTITY ;//QUANTITY
    public String STKRESULT;//STKRESULT
    public String CHECKDATE;//CHECKDATE
    public String QTYINSTK;//QTYINSTK
    public String STOCKTAKER;//STOCKTAKER

    public void setSTOCKTAKER(String STOCKTAKER) {
        this.STOCKTAKER = STOCKTAKER;
    }
    public String getSTOCKTAKER() {
        return STOCKTAKER;
    }

    public String getQTYINSTK() {
        return QTYINSTK;
    }

    public void setQTYINSTK(String QTYINSTK) {
        this.QTYINSTK = QTYINSTK;
    }

    public void setCHECKDATE(String CHECKDATE) {
        this.CHECKDATE = CHECKDATE;
    }

    public String getCHECKDATE() {
        return CHECKDATE;
    }

    public void setSTKRESULT(String STKRESULT) {
        this.STKRESULT = STKRESULT;
    }
    public String getSTKRESULT() {
        return STKRESULT;
    }
    public String getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(String QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public String getSTOCKTNUM() {
        return STOCKTNUM;
    }

    public void setSTOCKTNUM(String STOCKTNUM) {
        this.STOCKTNUM = STOCKTNUM;
    }

    public String getASSETNUM() {
        return ASSETNUM;
    }

    public void setASSETNUM(String ASSETNUM) {
        this.ASSETNUM = ASSETNUM;
    }

    public String getITEMNUM() {
        return ITEMNUM;
    }

    public void setITEMNUM(String ITEMNUM) {
        this.ITEMNUM = ITEMNUM;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getCONFIGURE() {
        return CONFIGURE;
    }

    public void setCONFIGURE(String CONFIGURE) {
        this.CONFIGURE = CONFIGURE;
    }

    public String getCHECKSERIAL() {
        return CHECKSERIAL;
    }

    public void setCHECKSERIAL(String CHECKSERIAL) {
        this.CHECKSERIAL = CHECKSERIAL;
    }

    public String getPHASE() {
        return PHASE;
    }

    public void setPHASE(String PHASE) {
        this.PHASE = PHASE;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getLINE() {
        return LINE;
    }

    public void setLINE(String LINE) {
        this.LINE = LINE;
    }

    public String getSERIALNUM() {
        return SERIALNUM;
    }

    public void setSERIALNUM(String SERIALNUM) {
        this.SERIALNUM = SERIALNUM;
    }

    public String getISCHECK() {
        return ISCHECK;
    }

    public void setISCHECK(String ISCHECK) {
        this.ISCHECK = ISCHECK;
    }

    public int getISSCAN() {
        return ISSCAN;
    }

    public void setISSCAN(int ISSCAN) {
        this.ISSCAN = ISSCAN;
    }

    public String getUDSTOCKTLINEID() {
        return UDSTOCKTLINEID;
    }

    public void setUDSTOCKTLINEID(String UDSTOCKTLINEID) {
        this.UDSTOCKTLINEID = UDSTOCKTLINEID;
    }
}
