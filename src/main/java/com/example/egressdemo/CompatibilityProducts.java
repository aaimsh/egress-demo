package com.example.egressdemo;

public class CompatibilityProducts {

    private String crmProductId;
    private String ratePlanId;
    private String reasonCode;

    public CompatibilityProducts() {
    }

    public CompatibilityProducts(String crmProductId, String ratePlanId, String reasonCode) {
        this.crmProductId = crmProductId;
        this.ratePlanId = ratePlanId;
        this.reasonCode = reasonCode;
    }

    public String getCrmProductId() {
        return crmProductId;
    }

    public void setCrmProductId(String crmProductId) {
        this.crmProductId = crmProductId;
    }

    public String getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(String ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
}
