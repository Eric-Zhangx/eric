package com.jufan.entity;

public class FinBankVerifyRel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_bank_verify_rel.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_bank_verify_rel.RECEIVABLE_ID
     *
     * @mbggenerated
     */
    private String receivableId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_bank_verify_rel.RECEIVED_ID
     *
     * @mbggenerated
     */
    private String receivedId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_bank_verify_rel.EBANK_RECORD_ID
     *
     * @mbggenerated
     */
    private String ebankRecordId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_bank_verify_rel.ID
     *
     * @return the value of fin_bank_verify_rel.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_bank_verify_rel.ID
     *
     * @param id the value for fin_bank_verify_rel.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_bank_verify_rel.RECEIVABLE_ID
     *
     * @return the value of fin_bank_verify_rel.RECEIVABLE_ID
     *
     * @mbggenerated
     */
    public String getReceivableId() {
        return receivableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_bank_verify_rel.RECEIVABLE_ID
     *
     * @param receivableId the value for fin_bank_verify_rel.RECEIVABLE_ID
     *
     * @mbggenerated
     */
    public void setReceivableId(String receivableId) {
        this.receivableId = receivableId == null ? null : receivableId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_bank_verify_rel.RECEIVED_ID
     *
     * @return the value of fin_bank_verify_rel.RECEIVED_ID
     *
     * @mbggenerated
     */
    public String getReceivedId() {
        return receivedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_bank_verify_rel.RECEIVED_ID
     *
     * @param receivedId the value for fin_bank_verify_rel.RECEIVED_ID
     *
     * @mbggenerated
     */
    public void setReceivedId(String receivedId) {
        this.receivedId = receivedId == null ? null : receivedId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_bank_verify_rel.EBANK_RECORD_ID
     *
     * @return the value of fin_bank_verify_rel.EBANK_RECORD_ID
     *
     * @mbggenerated
     */
    public String getEbankRecordId() {
        return ebankRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_bank_verify_rel.EBANK_RECORD_ID
     *
     * @param ebankRecordId the value for fin_bank_verify_rel.EBANK_RECORD_ID
     *
     * @mbggenerated
     */
    public void setEbankRecordId(String ebankRecordId) {
        this.ebankRecordId = ebankRecordId == null ? null : ebankRecordId.trim();
    }
}