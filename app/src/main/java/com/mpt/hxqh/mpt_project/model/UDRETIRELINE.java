package com.mpt.hxqh.mpt_project.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/22.
 * 资产报废
 */

public class UDRETIRELINE implements Serializable {
    public String ASSETNUM;//ASSETNUM
    public String FROMLOC;//FROMLOC
    public String LINE;//LINE
    public String RETIREDATE;//RETIREDATE
    public String RETIRELOC;//RETIRELOC
    public String RETIRENUM;//RETIRENUM
    public String SERIAL;//SERIAL

    public String getASSETNUM() {
        return ASSETNUM;
    }

    public void setASSETNUM(String ASSETNUM) {
        this.ASSETNUM = ASSETNUM;
    }

    public String getFROMLOC() {
        return FROMLOC;
    }

    public void setFROMLOC(String FROMLOC) {
        this.FROMLOC = FROMLOC;
    }

    public String getLINE() {
        return LINE;
    }

    public void setLINE(String LINE) {
        this.LINE = LINE;
    }

    public String getRETIREDATE() {
        return RETIREDATE;
    }

    public void setRETIREDATE(String RETIREDATE) {
        this.RETIREDATE = RETIREDATE;
    }

    public String getRETIRELOC() {
        return RETIRELOC;
    }

    public void setRETIRELOC(String RETIRELOC) {
        this.RETIRELOC = RETIRELOC;
    }

    public String getRETIRENUM() {
        return RETIRENUM;
    }

    public void setRETIRENUM(String RETIRENUM) {
        this.RETIRENUM = RETIRENUM;
    }

    public String getSERIAL() {
        return SERIAL;
    }

    public void setSERIAL(String SERIAL) {
        this.SERIAL = SERIAL;
    }
}
