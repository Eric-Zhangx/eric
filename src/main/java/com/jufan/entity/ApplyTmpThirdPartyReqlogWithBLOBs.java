package com.jufan.entity;

public class ApplyTmpThirdPartyReqlogWithBLOBs extends ApplyTmpThirdPartyReqlog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_tmp_third_party_reqlog.RESPONSE_RAW
     *
     * @mbggenerated
     */
    private String responseRaw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column apply_tmp_third_party_reqlog.REQUEST_RAW
     *
     * @mbggenerated
     */
    private String requestRaw;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_tmp_third_party_reqlog.RESPONSE_RAW
     *
     * @return the value of apply_tmp_third_party_reqlog.RESPONSE_RAW
     *
     * @mbggenerated
     */
    public String getResponseRaw() {
        return responseRaw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_tmp_third_party_reqlog.RESPONSE_RAW
     *
     * @param responseRaw the value for apply_tmp_third_party_reqlog.RESPONSE_RAW
     *
     * @mbggenerated
     */
    public void setResponseRaw(String responseRaw) {
        this.responseRaw = responseRaw == null ? null : responseRaw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column apply_tmp_third_party_reqlog.REQUEST_RAW
     *
     * @return the value of apply_tmp_third_party_reqlog.REQUEST_RAW
     *
     * @mbggenerated
     */
    public String getRequestRaw() {
        return requestRaw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column apply_tmp_third_party_reqlog.REQUEST_RAW
     *
     * @param requestRaw the value for apply_tmp_third_party_reqlog.REQUEST_RAW
     *
     * @mbggenerated
     */
    public void setRequestRaw(String requestRaw) {
        this.requestRaw = requestRaw == null ? null : requestRaw.trim();
    }
}