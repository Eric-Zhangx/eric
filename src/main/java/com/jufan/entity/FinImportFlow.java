package com.jufan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FinImportFlow {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.IMPORT_INFO_ID
     *
     * @mbggenerated
     */
    private String importInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.CHANNEL_CODE
     *
     * @mbggenerated
     */
    private String channelCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.PAYEE_CHANNEL
     *
     * @mbggenerated
     */
    private String payeeChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.PAYEE_NAME
     *
     * @mbggenerated
     */
    private String payeeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.PAYEE_ACCOUNT
     *
     * @mbggenerated
     */
    private String payeeAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.DRAWEE_CHANNEL
     *
     * @mbggenerated
     */
    private String draweeChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.DRAWEE_NAME
     *
     * @mbggenerated
     */
    private String draweeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.DRAWEE_ACCOUNT
     *
     * @mbggenerated
     */
    private String draweeAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.CURRENCY
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.IMPORT_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal importAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.FIX_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal fixAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.VERIFIED_AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal verifiedAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.TRANSACTION_ID
     *
     * @mbggenerated
     */
    private String transactionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.COMMIT_TIME
     *
     * @mbggenerated
     */
    private Date commitTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.IMPORT_TIME
     *
     * @mbggenerated
     */
    private Date importTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.CREATOR_ID
     *
     * @mbggenerated
     */
    private String creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.UPDATER_ID
     *
     * @mbggenerated
     */
    private String updaterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.CREATOR_NAME
     *
     * @mbggenerated
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fin_import_flow.UPDATER_NAME
     *
     * @mbggenerated
     */
    private String updaterName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.ID
     *
     * @return the value of fin_import_flow.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.ID
     *
     * @param id the value for fin_import_flow.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.IMPORT_INFO_ID
     *
     * @return the value of fin_import_flow.IMPORT_INFO_ID
     *
     * @mbggenerated
     */
    public String getImportInfoId() {
        return importInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.IMPORT_INFO_ID
     *
     * @param importInfoId the value for fin_import_flow.IMPORT_INFO_ID
     *
     * @mbggenerated
     */
    public void setImportInfoId(String importInfoId) {
        this.importInfoId = importInfoId == null ? null : importInfoId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.CHANNEL_CODE
     *
     * @return the value of fin_import_flow.CHANNEL_CODE
     *
     * @mbggenerated
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.CHANNEL_CODE
     *
     * @param channelCode the value for fin_import_flow.CHANNEL_CODE
     *
     * @mbggenerated
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.PAYEE_CHANNEL
     *
     * @return the value of fin_import_flow.PAYEE_CHANNEL
     *
     * @mbggenerated
     */
    public String getPayeeChannel() {
        return payeeChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.PAYEE_CHANNEL
     *
     * @param payeeChannel the value for fin_import_flow.PAYEE_CHANNEL
     *
     * @mbggenerated
     */
    public void setPayeeChannel(String payeeChannel) {
        this.payeeChannel = payeeChannel == null ? null : payeeChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.PAYEE_NAME
     *
     * @return the value of fin_import_flow.PAYEE_NAME
     *
     * @mbggenerated
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.PAYEE_NAME
     *
     * @param payeeName the value for fin_import_flow.PAYEE_NAME
     *
     * @mbggenerated
     */
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName == null ? null : payeeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.PAYEE_ACCOUNT
     *
     * @return the value of fin_import_flow.PAYEE_ACCOUNT
     *
     * @mbggenerated
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.PAYEE_ACCOUNT
     *
     * @param payeeAccount the value for fin_import_flow.PAYEE_ACCOUNT
     *
     * @mbggenerated
     */
    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount == null ? null : payeeAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.DRAWEE_CHANNEL
     *
     * @return the value of fin_import_flow.DRAWEE_CHANNEL
     *
     * @mbggenerated
     */
    public String getDraweeChannel() {
        return draweeChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.DRAWEE_CHANNEL
     *
     * @param draweeChannel the value for fin_import_flow.DRAWEE_CHANNEL
     *
     * @mbggenerated
     */
    public void setDraweeChannel(String draweeChannel) {
        this.draweeChannel = draweeChannel == null ? null : draweeChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.DRAWEE_NAME
     *
     * @return the value of fin_import_flow.DRAWEE_NAME
     *
     * @mbggenerated
     */
    public String getDraweeName() {
        return draweeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.DRAWEE_NAME
     *
     * @param draweeName the value for fin_import_flow.DRAWEE_NAME
     *
     * @mbggenerated
     */
    public void setDraweeName(String draweeName) {
        this.draweeName = draweeName == null ? null : draweeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.DRAWEE_ACCOUNT
     *
     * @return the value of fin_import_flow.DRAWEE_ACCOUNT
     *
     * @mbggenerated
     */
    public String getDraweeAccount() {
        return draweeAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.DRAWEE_ACCOUNT
     *
     * @param draweeAccount the value for fin_import_flow.DRAWEE_ACCOUNT
     *
     * @mbggenerated
     */
    public void setDraweeAccount(String draweeAccount) {
        this.draweeAccount = draweeAccount == null ? null : draweeAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.CURRENCY
     *
     * @return the value of fin_import_flow.CURRENCY
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.CURRENCY
     *
     * @param currency the value for fin_import_flow.CURRENCY
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.IMPORT_AMOUNT
     *
     * @return the value of fin_import_flow.IMPORT_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getImportAmount() {
        return importAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.IMPORT_AMOUNT
     *
     * @param importAmount the value for fin_import_flow.IMPORT_AMOUNT
     *
     * @mbggenerated
     */
    public void setImportAmount(BigDecimal importAmount) {
        this.importAmount = importAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.FIX_AMOUNT
     *
     * @return the value of fin_import_flow.FIX_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getFixAmount() {
        return fixAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.FIX_AMOUNT
     *
     * @param fixAmount the value for fin_import_flow.FIX_AMOUNT
     *
     * @mbggenerated
     */
    public void setFixAmount(BigDecimal fixAmount) {
        this.fixAmount = fixAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.AMOUNT
     *
     * @return the value of fin_import_flow.AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.AMOUNT
     *
     * @param amount the value for fin_import_flow.AMOUNT
     *
     * @mbggenerated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.VERIFIED_AMOUNT
     *
     * @return the value of fin_import_flow.VERIFIED_AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getVerifiedAmount() {
        return verifiedAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.VERIFIED_AMOUNT
     *
     * @param verifiedAmount the value for fin_import_flow.VERIFIED_AMOUNT
     *
     * @mbggenerated
     */
    public void setVerifiedAmount(BigDecimal verifiedAmount) {
        this.verifiedAmount = verifiedAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.TRANSACTION_ID
     *
     * @return the value of fin_import_flow.TRANSACTION_ID
     *
     * @mbggenerated
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.TRANSACTION_ID
     *
     * @param transactionId the value for fin_import_flow.TRANSACTION_ID
     *
     * @mbggenerated
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.COMMIT_TIME
     *
     * @return the value of fin_import_flow.COMMIT_TIME
     *
     * @mbggenerated
     */
    public Date getCommitTime() {
        return commitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.COMMIT_TIME
     *
     * @param commitTime the value for fin_import_flow.COMMIT_TIME
     *
     * @mbggenerated
     */
    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.IMPORT_TIME
     *
     * @return the value of fin_import_flow.IMPORT_TIME
     *
     * @mbggenerated
     */
    public Date getImportTime() {
        return importTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.IMPORT_TIME
     *
     * @param importTime the value for fin_import_flow.IMPORT_TIME
     *
     * @mbggenerated
     */
    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.NOTE
     *
     * @return the value of fin_import_flow.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.NOTE
     *
     * @param note the value for fin_import_flow.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.STATUS
     *
     * @return the value of fin_import_flow.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.STATUS
     *
     * @param status the value for fin_import_flow.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.CREATE_TIME
     *
     * @return the value of fin_import_flow.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.CREATE_TIME
     *
     * @param createTime the value for fin_import_flow.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.UPDATE_TIME
     *
     * @return the value of fin_import_flow.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.UPDATE_TIME
     *
     * @param updateTime the value for fin_import_flow.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.CREATOR_ID
     *
     * @return the value of fin_import_flow.CREATOR_ID
     *
     * @mbggenerated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.CREATOR_ID
     *
     * @param creatorId the value for fin_import_flow.CREATOR_ID
     *
     * @mbggenerated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.UPDATER_ID
     *
     * @return the value of fin_import_flow.UPDATER_ID
     *
     * @mbggenerated
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.UPDATER_ID
     *
     * @param updaterId the value for fin_import_flow.UPDATER_ID
     *
     * @mbggenerated
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.CREATOR_NAME
     *
     * @return the value of fin_import_flow.CREATOR_NAME
     *
     * @mbggenerated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.CREATOR_NAME
     *
     * @param creatorName the value for fin_import_flow.CREATOR_NAME
     *
     * @mbggenerated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fin_import_flow.UPDATER_NAME
     *
     * @return the value of fin_import_flow.UPDATER_NAME
     *
     * @mbggenerated
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fin_import_flow.UPDATER_NAME
     *
     * @param updaterName the value for fin_import_flow.UPDATER_NAME
     *
     * @mbggenerated
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }
}