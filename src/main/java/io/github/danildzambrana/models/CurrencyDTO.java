package io.github.danildzambrana.models;

import com.google.gson.annotations.SerializedName;

public class CurrencyDTO {
    @SerializedName("result")
    private String result;
    @SerializedName("documentation")
    private String documentation;
    @SerializedName("terms_of_use")
    private String termsOfUse;
    @SerializedName("time_last_update_unix")
    private long timeLastUpdateUnix;
    @SerializedName("time_last_update_utc")
    private String timeLastUpdateUtc;
    @SerializedName("time_next_update_unix")
    private long timeNextUpdateUnix;
    @SerializedName("time_next_update_utc")
    private String timeNextUpdateUtc;
    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("target_code")
    private String targetCode;
    @SerializedName("conversion_rate")
    private double conversionRate;
    @SerializedName("conversion_result")
    private double conversionResult;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public long getTimeLastUpdateUnix() {
        return timeLastUpdateUnix;
    }

    public void setTimeLastUpdateUnix(long timeLastUpdateUnix) {
        this.timeLastUpdateUnix = timeLastUpdateUnix;
    }

    public String getTimeLastUpdateUtc() {
        return timeLastUpdateUtc;
    }

    public void setTimeLastUpdateUtc(String timeLastUpdateUtc) {
        this.timeLastUpdateUtc = timeLastUpdateUtc;
    }

    public long getTimeNextUpdateUnix() {
        return timeNextUpdateUnix;
    }

    public void setTimeNextUpdateUnix(long timeNextUpdateUnix) {
        this.timeNextUpdateUnix = timeNextUpdateUnix;
    }

    public String getTimeNextUpdateUtc() {
        return timeNextUpdateUtc;
    }

    public void setTimeNextUpdateUtc(String timeNextUpdateUtc) {
        this.timeNextUpdateUtc = timeNextUpdateUtc;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(double conversionResult) {
        this.conversionResult = conversionResult;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "result='" + result + '\'' +
                ", documentation='" + documentation + '\'' +
                ", termsOfUse='" + termsOfUse + '\'' +
                ", timeLastUpdateUnix=" + timeLastUpdateUnix +
                ", timeLastUpdateUtc='" + timeLastUpdateUtc + '\'' +
                ", timeNextUpdateUnix=" + timeNextUpdateUnix +
                ", timeNextUpdateUtc='" + timeNextUpdateUtc + '\'' +
                ", baseCode='" + baseCode + '\'' +
                ", targetCode='" + targetCode + '\'' +
                ", conversionRate=" + conversionRate +
                ", conversionResult=" + conversionResult +
                '}';
    }
}
