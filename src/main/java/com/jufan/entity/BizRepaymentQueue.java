package com.jufan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizRepaymentQueue {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.BATCH_ID
     *
     * @mbggenerated
     */
    private String batchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.RECEIVABLE_ID
     *
     * @mbggenerated
     */
    private String receivableId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.CONTRACT_ID
     *
     * @mbggenerated
     */
    private String contractId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.CUSTOMER_ID
     *
     * @mbggenerated
     */
    private String customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.REPAYMENT_PLAN_ID
     *
     * @mbggenerated
     */
    private String repaymentPlanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.CONSUME_CHANNEL
     *
     * @mbggenerated
     */
    private String consumeChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.CONSUME_CHANNEL_SUBJECT
     *
     * @mbggenerated
     */
    private String consumeChannelSubject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.DEBIT_NAME
     *
     * @mbggenerated
     */
    private String debitName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.RESP_NUMBER
     *
     * @mbggenerated
     */
    private String respNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.DEBIT_BANK_CODE
     *
     * @mbggenerated
     */
    private String debitBankCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.DEBIT_BANK_NAME
     *
     * @mbggenerated
     */
    private String debitBankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.DEBIT_BANK_FULLNAME
     *
     * @mbggenerated
     */
    private String debitBankFullname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.DEBIT_BANK_ACCOUNT
     *
     * @mbggenerated
     */
    private String debitBankAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.TOTAL_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal totalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.ACTUAL_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal actualAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.SEQ
     *
     * @mbggenerated
     */
    private Integer seq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.PERIOD
     *
     * @mbggenerated
     */
    private Integer period;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.PRIORITY
     *
     * @mbggenerated
     */
    private Integer priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.BIND_ID
     *
     * @mbggenerated
     */
    private String bindId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.EXT_VALUE
     *
     * @mbggenerated
     */
    private String extValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.SEND_STATUS
     *
     * @mbggenerated
     */
    private String sendStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.CREATOR_ID
     *
     * @mbggenerated
     */
    private String creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.UPDATER_ID
     *
     * @mbggenerated
     */
    private String updaterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.CREATOR_NAME
     *
     * @mbggenerated
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_repayment_queue.UPDATER_NAME
     *
     * @mbggenerated
     */
    private String updaterName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.ID
     *
     * @return the value of biz_repayment_queue.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.ID
     *
     * @param id the value for biz_repayment_queue.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.BATCH_ID
     *
     * @return the value of biz_repayment_queue.BATCH_ID
     *
     * @mbggenerated
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.BATCH_ID
     *
     * @param batchId the value for biz_repayment_queue.BATCH_ID
     *
     * @mbggenerated
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.RECEIVABLE_ID
     *
     * @return the value of biz_repayment_queue.RECEIVABLE_ID
     *
     * @mbggenerated
     */
    public String getReceivableId() {
        return receivableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.RECEIVABLE_ID
     *
     * @param receivableId the value for biz_repayment_queue.RECEIVABLE_ID
     *
     * @mbggenerated
     */
    public void setReceivableId(String receivableId) {
        this.receivableId = receivableId == null ? null : receivableId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.CONTRACT_ID
     *
     * @return the value of biz_repayment_queue.CONTRACT_ID
     *
     * @mbggenerated
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.CONTRACT_ID
     *
     * @param contractId the value for biz_repayment_queue.CONTRACT_ID
     *
     * @mbggenerated
     */
    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.CUSTOMER_ID
     *
     * @return the value of biz_repayment_queue.CUSTOMER_ID
     *
     * @mbggenerated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.CUSTOMER_ID
     *
     * @param customerId the value for biz_repayment_queue.CUSTOMER_ID
     *
     * @mbggenerated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.REPAYMENT_PLAN_ID
     *
     * @return the value of biz_repayment_queue.REPAYMENT_PLAN_ID
     *
     * @mbggenerated
     */
    public String getRepaymentPlanId() {
        return repaymentPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.REPAYMENT_PLAN_ID
     *
     * @param repaymentPlanId the value for biz_repayment_queue.REPAYMENT_PLAN_ID
     *
     * @mbggenerated
     */
    public void setRepaymentPlanId(String repaymentPlanId) {
        this.repaymentPlanId = repaymentPlanId == null ? null : repaymentPlanId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.CONSUME_CHANNEL
     *
     * @return the value of biz_repayment_queue.CONSUME_CHANNEL
     *
     * @mbggenerated
     */
    public String getConsumeChannel() {
        return consumeChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.CONSUME_CHANNEL
     *
     * @param consumeChannel the value for biz_repayment_queue.CONSUME_CHANNEL
     *
     * @mbggenerated
     */
    public void setConsumeChannel(String consumeChannel) {
        this.consumeChannel = consumeChannel == null ? null : consumeChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.CONSUME_CHANNEL_SUBJECT
     *
     * @return the value of biz_repayment_queue.CONSUME_CHANNEL_SUBJECT
     *
     * @mbggenerated
     */
    public String getConsumeChannelSubject() {
        return consumeChannelSubject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.CONSUME_CHANNEL_SUBJECT
     *
     * @param consumeChannelSubject the value for biz_repayment_queue.CONSUME_CHANNEL_SUBJECT
     *
     * @mbggenerated
     */
    public void setConsumeChannelSubject(String consumeChannelSubject) {
        this.consumeChannelSubject = consumeChannelSubject == null ? null : consumeChannelSubject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.DEBIT_NAME
     *
     * @return the value of biz_repayment_queue.DEBIT_NAME
     *
     * @mbggenerated
     */
    public String getDebitName() {
        return debitName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.DEBIT_NAME
     *
     * @param debitName the value for biz_repayment_queue.DEBIT_NAME
     *
     * @mbggenerated
     */
    public void setDebitName(String debitName) {
        this.debitName = debitName == null ? null : debitName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.RESP_NUMBER
     *
     * @return the value of biz_repayment_queue.RESP_NUMBER
     *
     * @mbggenerated
     */
    public String getRespNumber() {
        return respNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.RESP_NUMBER
     *
     * @param respNumber the value for biz_repayment_queue.RESP_NUMBER
     *
     * @mbggenerated
     */
    public void setRespNumber(String respNumber) {
        this.respNumber = respNumber == null ? null : respNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.DEBIT_BANK_CODE
     *
     * @return the value of biz_repayment_queue.DEBIT_BANK_CODE
     *
     * @mbggenerated
     */
    public String getDebitBankCode() {
        return debitBankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.DEBIT_BANK_CODE
     *
     * @param debitBankCode the value for biz_repayment_queue.DEBIT_BANK_CODE
     *
     * @mbggenerated
     */
    public void setDebitBankCode(String debitBankCode) {
        this.debitBankCode = debitBankCode == null ? null : debitBankCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.DEBIT_BANK_NAME
     *
     * @return the value of biz_repayment_queue.DEBIT_BANK_NAME
     *
     * @mbggenerated
     */
    public String getDebitBankName() {
        return debitBankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.DEBIT_BANK_NAME
     *
     * @param debitBankName the value for biz_repayment_queue.DEBIT_BANK_NAME
     *
     * @mbggenerated
     */
    public void setDebitBankName(String debitBankName) {
        this.debitBankName = debitBankName == null ? null : debitBankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.DEBIT_BANK_FULLNAME
     *
     * @return the value of biz_repayment_queue.DEBIT_BANK_FULLNAME
     *
     * @mbggenerated
     */
    public String getDebitBankFullname() {
        return debitBankFullname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.DEBIT_BANK_FULLNAME
     *
     * @param debitBankFullname the value for biz_repayment_queue.DEBIT_BANK_FULLNAME
     *
     * @mbggenerated
     */
    public void setDebitBankFullname(String debitBankFullname) {
        this.debitBankFullname = debitBankFullname == null ? null : debitBankFullname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.DEBIT_BANK_ACCOUNT
     *
     * @return the value of biz_repayment_queue.DEBIT_BANK_ACCOUNT
     *
     * @mbggenerated
     */
    public String getDebitBankAccount() {
        return debitBankAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.DEBIT_BANK_ACCOUNT
     *
     * @param debitBankAccount the value for biz_repayment_queue.DEBIT_BANK_ACCOUNT
     *
     * @mbggenerated
     */
    public void setDebitBankAccount(String debitBankAccount) {
        this.debitBankAccount = debitBankAccount == null ? null : debitBankAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.TOTAL_AMOUNT
     *
     * @return the value of biz_repayment_queue.TOTAL_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.TOTAL_AMOUNT
     *
     * @param totalAmount the value for biz_repayment_queue.TOTAL_AMOUNT
     *
     * @mbggenerated
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.ACTUAL_AMOUNT
     *
     * @return the value of biz_repayment_queue.ACTUAL_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.ACTUAL_AMOUNT
     *
     * @param actualAmount the value for biz_repayment_queue.ACTUAL_AMOUNT
     *
     * @mbggenerated
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.SEQ
     *
     * @return the value of biz_repayment_queue.SEQ
     *
     * @mbggenerated
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.SEQ
     *
     * @param seq the value for biz_repayment_queue.SEQ
     *
     * @mbggenerated
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.PERIOD
     *
     * @return the value of biz_repayment_queue.PERIOD
     *
     * @mbggenerated
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.PERIOD
     *
     * @param period the value for biz_repayment_queue.PERIOD
     *
     * @mbggenerated
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.PRIORITY
     *
     * @return the value of biz_repayment_queue.PRIORITY
     *
     * @mbggenerated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.PRIORITY
     *
     * @param priority the value for biz_repayment_queue.PRIORITY
     *
     * @mbggenerated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.BIND_ID
     *
     * @return the value of biz_repayment_queue.BIND_ID
     *
     * @mbggenerated
     */
    public String getBindId() {
        return bindId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.BIND_ID
     *
     * @param bindId the value for biz_repayment_queue.BIND_ID
     *
     * @mbggenerated
     */
    public void setBindId(String bindId) {
        this.bindId = bindId == null ? null : bindId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.EXT_VALUE
     *
     * @return the value of biz_repayment_queue.EXT_VALUE
     *
     * @mbggenerated
     */
    public String getExtValue() {
        return extValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.EXT_VALUE
     *
     * @param extValue the value for biz_repayment_queue.EXT_VALUE
     *
     * @mbggenerated
     */
    public void setExtValue(String extValue) {
        this.extValue = extValue == null ? null : extValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.SEND_STATUS
     *
     * @return the value of biz_repayment_queue.SEND_STATUS
     *
     * @mbggenerated
     */
    public String getSendStatus() {
        return sendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.SEND_STATUS
     *
     * @param sendStatus the value for biz_repayment_queue.SEND_STATUS
     *
     * @mbggenerated
     */
    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.STATUS
     *
     * @return the value of biz_repayment_queue.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.STATUS
     *
     * @param status the value for biz_repayment_queue.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.NOTE
     *
     * @return the value of biz_repayment_queue.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.NOTE
     *
     * @param note the value for biz_repayment_queue.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.CREATE_TIME
     *
     * @return the value of biz_repayment_queue.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.CREATE_TIME
     *
     * @param createTime the value for biz_repayment_queue.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.UPDATE_TIME
     *
     * @return the value of biz_repayment_queue.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.UPDATE_TIME
     *
     * @param updateTime the value for biz_repayment_queue.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.CREATOR_ID
     *
     * @return the value of biz_repayment_queue.CREATOR_ID
     *
     * @mbggenerated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.CREATOR_ID
     *
     * @param creatorId the value for biz_repayment_queue.CREATOR_ID
     *
     * @mbggenerated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.UPDATER_ID
     *
     * @return the value of biz_repayment_queue.UPDATER_ID
     *
     * @mbggenerated
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.UPDATER_ID
     *
     * @param updaterId the value for biz_repayment_queue.UPDATER_ID
     *
     * @mbggenerated
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.CREATOR_NAME
     *
     * @return the value of biz_repayment_queue.CREATOR_NAME
     *
     * @mbggenerated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.CREATOR_NAME
     *
     * @param creatorName the value for biz_repayment_queue.CREATOR_NAME
     *
     * @mbggenerated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_repayment_queue.UPDATER_NAME
     *
     * @return the value of biz_repayment_queue.UPDATER_NAME
     *
     * @mbggenerated
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_repayment_queue.UPDATER_NAME
     *
     * @param updaterName the value for biz_repayment_queue.UPDATER_NAME
     *
     * @mbggenerated
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }
}