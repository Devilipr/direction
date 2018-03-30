package com.thinkgem.jeesite.web.vo;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * Author: lyp
 * Create Date: 2018/2/12
 * Description:
 */
public class DeliveryDesVo implements Serializable {
    private static final long serialVersionUID = -3701995371239710841L;

    @NotBlank
    private String djbh;
    @NotBlank
    private String drugType;
    @NotBlank
    private String url;

    public String getDjbh() {
        return djbh;
    }

    public void setDjbh(String djbh) {
        this.djbh = djbh;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
