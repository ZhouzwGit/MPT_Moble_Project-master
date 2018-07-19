package com.mpt.hxqh.mpt_project.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/22.
 * 资产移动行
 */

public class UDTRANSFLINE implements Serializable {
    public String ASSETNUM;//ASSETNUM
    public String CREATEBY;//CREATEBY
    public String CREATED;//CREATED
    public String FROMSITE;//FROMSITE
    public String TOSITE;//TOSITE

    public String getASSETNUM() {
        return ASSETNUM;
    }

    public void setASSETNUM(String ASSETNUM) {
        this.ASSETNUM = ASSETNUM;
    }

    public String getCREATEBY() {
        return CREATEBY;
    }

    public void setCREATEBY(String CREATEBY) {
        this.CREATEBY = CREATEBY;
    }

    public String getCREATED() {
        return CREATED;
    }

    public void setCREATED(String CREATED) {
        this.CREATED = CREATED;
    }

    public String getFROMSITE() {
        return FROMSITE;
    }

    public void setFROMSITE(String FROMSITE) {
        this.FROMSITE = FROMSITE;
    }

    public String getTOSITE() {
        return TOSITE;
    }

    public void setTOSITE(String TOSITE) {
        this.TOSITE = TOSITE;
    }
}
