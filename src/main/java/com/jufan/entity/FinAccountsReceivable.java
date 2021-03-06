package com.jufan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FinAccountsReceivable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.BIZ_TYPE
     *
     * @mbggenerated
     */
    private String bizType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.BIZ_TYPE_NAME
     *
     * @mbggenerated
     */
    private String bizTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.CHARGE_TYPE_CODE
     *
     * @mbggenerated
     */
    private String chargeTypeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.CHARGE_TYPE_NAME
     *
     * @mbggenerated
     */
    private String chargeTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.REF_ID
     *
     * @mbggenerated
     */
    private String refId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.REPAY_PLAN_ID
     *
     * @mbggenerated
     */
    private String repayPlanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.REQUEST_START_TIME
     *
     * @mbggenerated
     */
    private Date requestStartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.REQUEST_TIME
     *
     * @mbggenerated
     */
    private Date requestTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.PAY_METHOD
     *
     * @mbggenerated
     */
    private String payMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.CHANNEL_CODE
     *
     * @mbggenerated
     */
    private String channelCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.CURRENCY_CODE
     *
     * @mbggenerated
     */
    private String currencyCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.ACC_NAME
     *
     * @mbggenerated
     */
    private String accName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.ACC_NUMBER
     *
     * @mbggenerated
     */
    private String accNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.TRANSACTION_ID
     *
     * @mbggenerated
     */
    private String transactionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.AMOUNT_RECEIVED
     *
     * @mbggenerated
     */
    private BigDecimal amountReceived;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.SETTLE_TYPE
     *
     * @mbggenerated
     */
    private String settleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.RECEIVE_TYPE
     *
     * @mbggenerated
     */
    private String receiveType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.RECEIVE_TIME
     *
     * @mbggenerated
     */
    private Date receiveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.VERIFY_TIME
     *
     * @mbggenerated
     */
    private Date verifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.VALID_TIME
     *
     * @mbggenerated
     */
    private Date validTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.VERIFY_STATUS
     *
     * @mbggenerated
     */
    private String verifyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.CREATOR_ID
     *
     * @mbggenerated
     */
    private String creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.UPDATER_ID
     *
     * @mbggenerated
     */
    private String updaterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.CREATOR_NAME
     *
     * @mbggenerated
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_accounts_receivable.UPDATER_NAME
     *
     * @mbggenerated
     */
    private String updaterName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.ID
     *
     * @return the value of fin_accounts_receivable.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.ID
     *
     * @param id the value for fin_accounts_receivable.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.BIZ_TYPE
     *
     * @return the value of fin_accounts_receivable.BIZ_TYPE
     *
     * @mbggenerated
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.BIZ_TYPE
     *
     * @param bizType the value for fin_accounts_receivable.BIZ_TYPE
     *
     * @mbggenerated
     */
    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.BIZ_TYPE_NAME
     *
     * @return the value of fin_accounts_receivable.BIZ_TYPE_NAME
     *
     * @mbggenerated
     */
    public String getBizTypeName() {
        return bizTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.BIZ_TYPE_NAME
     *
     * @param bizTypeName the value for fin_accounts_receivable.BIZ_TYPE_NAME
     *
     * @mbggenerated
     */
    public void setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName == null ? null : bizTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.CHARGE_TYPE_CODE
     *
     * @return the value of fin_accounts_receivable.CHARGE_TYPE_CODE
     *
     * @mbggenerated
     */
    public String getChargeTypeCode() {
        return chargeTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.CHARGE_TYPE_CODE
     *
     * @param chargeTypeCode the value for fin_accounts_receivable.CHARGE_TYPE_CODE
     *
     * @mbggenerated
     */
    public void setChargeTypeCode(String chargeTypeCode) {
        this.chargeTypeCode = chargeTypeCode == null ? null : chargeTypeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.CHARGE_TYPE_NAME
     *
     * @return the value of fin_accounts_receivable.CHARGE_TYPE_NAME
     *
     * @mbggenerated
     */
    public String getChargeTypeName() {
        return chargeTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.CHARGE_TYPE_NAME
     *
     * @param chargeTypeName the value for fin_accounts_receivable.CHARGE_TYPE_NAME
     *
     * @mbggenerated
     */
    public void setChargeTypeName(String chargeTypeName) {
        this.chargeTypeName = chargeTypeName == null ? null : chargeTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.REF_ID
     *
     * @return the value of fin_accounts_receivable.REF_ID
     *
     * @mbggenerated
     */
    public String getRefId() {
        return refId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.REF_ID
     *
     * @param refId the value for fin_accounts_receivable.REF_ID
     *
     * @mbggenerated
     */
    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.REPAY_PLAN_ID
     *
     * @return the value of fin_accounts_receivable.REPAY_PLAN_ID
     *
     * @mbggenerated
     */
    public String getRepayPlanId() {
        return repayPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.REPAY_PLAN_ID
     *
     * @param repayPlanId the value for fin_accounts_receivable.REPAY_PLAN_ID
     *
     * @mbggenerated
     */
    public void setRepayPlanId(String repayPlanId) {
        this.repayPlanId = repayPlanId == null ? null : repayPlanId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.REQUEST_START_TIME
     *
     * @return the value of fin_accounts_receivable.REQUEST_START_TIME
     *
     * @mbggenerated
     */
    public Date getRequestStartTime() {
        return requestStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.REQUEST_START_TIME
     *
     * @param requestStartTime the value for fin_accounts_receivable.REQUEST_START_TIME
     *
     * @mbggenerated
     */
    public void setRequestStartTime(Date requestStartTime) {
        this.requestStartTime = requestStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.REQUEST_TIME
     *
     * @return the value of fin_accounts_receivable.REQUEST_TIME
     *
     * @mbggenerated
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.REQUEST_TIME
     *
     * @param requestTime the value for fin_accounts_receivable.REQUEST_TIME
     *
     * @mbggenerated
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.PAY_METHOD
     *
     * @return the value of fin_accounts_receivable.PAY_METHOD
     *
     * @mbggenerated
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.PAY_METHOD
     *
     * @param payMethod the value for fin_accounts_receivable.PAY_METHOD
     *
     * @mbggenerated
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.CHANNEL_CODE
     *
     * @return the value of fin_accounts_receivable.CHANNEL_CODE
     *
     * @mbggenerated
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.CHANNEL_CODE
     *
     * @param channelCode the value for fin_accounts_receivable.CHANNEL_CODE
     *
     * @mbggenerated
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.CURRENCY_CODE
     *
     * @return the value of fin_accounts_receivable.CURRENCY_CODE
     *
     * @mbggenerated
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.CURRENCY_CODE
     *
     * @param currencyCode the value for fin_accounts_receivable.CURRENCY_CODE
     *
     * @mbggenerated
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.ACC_NAME
     *
     * @return the value of fin_accounts_receivable.ACC_NAME
     *
     * @mbggenerated
     */
    public String getAccName() {
        return accName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.ACC_NAME
     *
     * @param accName the value for fin_accounts_receivable.ACC_NAME
     *
     * @mbggenerated
     */
    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.ACC_NUMBER
     *
     * @return the value of fin_accounts_receivable.ACC_NUMBER
     *
     * @mbggenerated
     */
    public String getAccNumber() {
        return accNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.ACC_NUMBER
     *
     * @param accNumber the value for fin_accounts_receivable.ACC_NUMBER
     *
     * @mbggenerated
     */
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber == null ? null : accNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.TRANSACTION_ID
     *
     * @return the value of fin_accounts_receivable.TRANSACTION_ID
     *
     * @mbggenerated
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.TRANSACTION_ID
     *
     * @param transactionId the value for fin_accounts_receivable.TRANSACTION_ID
     *
     * @mbggenerated
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.AMOUNT
     *
     * @return the value of fin_accounts_receivable.AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.AMOUNT
     *
     * @param amount the value for fin_accounts_receivable.AMOUNT
     *
     * @mbggenerated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.AMOUNT_RECEIVED
     *
     * @return the value of fin_accounts_receivable.AMOUNT_RECEIVED
     *
     * @mbggenerated
     */
    public BigDecimal getAmountReceived() {
        return amountReceived;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.AMOUNT_RECEIVED
     *
     * @param amountReceived the value for fin_accounts_receivable.AMOUNT_RECEIVED
     *
     * @mbggenerated
     */
    public void setAmountReceived(BigDecimal amountReceived) {
        this.amountReceived = amountReceived;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.SETTLE_TYPE
     *
     * @return the value of fin_accounts_receivable.SETTLE_TYPE
     *
     * @mbggenerated
     */
    public String getSettleType() {
        return settleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.SETTLE_TYPE
     *
     * @param settleType the value for fin_accounts_receivable.SETTLE_TYPE
     *
     * @mbggenerated
     */
    public void setSettleType(String settleType) {
        this.settleType = settleType == null ? null : settleType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.RECEIVE_TYPE
     *
     * @return the value of fin_accounts_receivable.RECEIVE_TYPE
     *
     * @mbggenerated
     */
    public String getReceiveType() {
        return receiveType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.RECEIVE_TYPE
     *
     * @param receiveType the value for fin_accounts_receivable.RECEIVE_TYPE
     *
     * @mbggenerated
     */
    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType == null ? null : receiveType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.RECEIVE_TIME
     *
     * @return the value of fin_accounts_receivable.RECEIVE_TIME
     *
     * @mbggenerated
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.RECEIVE_TIME
     *
     * @param receiveTime the value for fin_accounts_receivable.RECEIVE_TIME
     *
     * @mbggenerated
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.VERIFY_TIME
     *
     * @return the value of fin_accounts_receivable.VERIFY_TIME
     *
     * @mbggenerated
     */
    public Date getVerifyTime() {
        return verifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.VERIFY_TIME
     *
     * @param verifyTime the value for fin_accounts_receivable.VERIFY_TIME
     *
     * @mbggenerated
     */
    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.VALID_TIME
     *
     * @return the value of fin_accounts_receivable.VALID_TIME
     *
     * @mbggenerated
     */
    public Date getValidTime() {
        return validTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.VALID_TIME
     *
     * @param validTime the value for fin_accounts_receivable.VALID_TIME
     *
     * @mbggenerated
     */
    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.STATUS
     *
     * @return the value of fin_accounts_receivable.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.STATUS
     *
     * @param status the value for fin_accounts_receivable.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.VERIFY_STATUS
     *
     * @return the value of fin_accounts_receivable.VERIFY_STATUS
     *
     * @mbggenerated
     */
    public String getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.VERIFY_STATUS
     *
     * @param verifyStatus the value for fin_accounts_receivable.VERIFY_STATUS
     *
     * @mbggenerated
     */
    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus == null ? null : verifyStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.NOTE
     *
     * @return the value of fin_accounts_receivable.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.NOTE
     *
     * @param note the value for fin_accounts_receivable.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.CREATE_TIME
     *
     * @return the value of fin_accounts_receivable.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.CREATE_TIME
     *
     * @param createTime the value for fin_accounts_receivable.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.UPDATE_TIME
     *
     * @return the value of fin_accounts_receivable.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.UPDATE_TIME
     *
     * @param updateTime the value for fin_accounts_receivable.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.CREATOR_ID
     *
     * @return the value of fin_accounts_receivable.CREATOR_ID
     *
     * @mbggenerated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.CREATOR_ID
     *
     * @param creatorId the value for fin_accounts_receivable.CREATOR_ID
     *
     * @mbggenerated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.UPDATER_ID
     *
     * @return the value of fin_accounts_receivable.UPDATER_ID
     *
     * @mbggenerated
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.UPDATER_ID
     *
     * @param updaterId the value for fin_accounts_receivable.UPDATER_ID
     *
     * @mbggenerated
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.CREATOR_NAME
     *
     * @return the value of fin_accounts_receivable.CREATOR_NAME
     *
     * @mbggenerated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.CREATOR_NAME
     *
     * @param creatorName the value for fin_accounts_receivable.CREATOR_NAME
     *
     * @mbggenerated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_accounts_receivable.UPDATER_NAME
     *
     * @return the value of fin_accounts_receivable.UPDATER_NAME
     *
     * @mbggenerated
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_accounts_receivable.UPDATER_NAME
     *
     * @param updaterName the value for fin_accounts_receivable.UPDATER_NAME
     *
     * @mbggenerated
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }
}