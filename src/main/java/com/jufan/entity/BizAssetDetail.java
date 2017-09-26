package com.jufan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizAssetDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.ASSET_ID
     *
     * @mbggenerated
     */
    private String assetId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.ASSET_TYPE
     *
     * @mbggenerated
     */
    private String assetType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.MARCHANT_ID
     *
     * @mbggenerated
     */
    private String marchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.MARCHANT_NAME
     *
     * @mbggenerated
     */
    private String marchantName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.CHANNEL_TARGET
     *
     * @mbggenerated
     */
    private String channelTarget;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.CHANNEL_TARGET_NAME
     *
     * @mbggenerated
     */
    private String channelTargetName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.ASSET_APPLY_TIME
     *
     * @mbggenerated
     */
    private Date assetApplyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.INSTALLMENT_APPLY_TIME
     *
     * @mbggenerated
     */
    private Date installmentApplyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.INTEREST
     *
     * @mbggenerated
     */
    private BigDecimal interest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.AMOUNT
     *
     * @mbggenerated
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.CREATOR_ID
     *
     * @mbggenerated
     */
    private String creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.UPDATER_ID
     *
     * @mbggenerated
     */
    private String updaterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.CREATOR_NAME
     *
     * @mbggenerated
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset_detail.UPDATER_NAME
     *
     * @mbggenerated
     */
    private String updaterName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.ID
     *
     * @return the value of biz_asset_detail.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.ID
     *
     * @param id the value for biz_asset_detail.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.ASSET_ID
     *
     * @return the value of biz_asset_detail.ASSET_ID
     *
     * @mbggenerated
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.ASSET_ID
     *
     * @param assetId the value for biz_asset_detail.ASSET_ID
     *
     * @mbggenerated
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId == null ? null : assetId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.ASSET_TYPE
     *
     * @return the value of biz_asset_detail.ASSET_TYPE
     *
     * @mbggenerated
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.ASSET_TYPE
     *
     * @param assetType the value for biz_asset_detail.ASSET_TYPE
     *
     * @mbggenerated
     */
    public void setAssetType(String assetType) {
        this.assetType = assetType == null ? null : assetType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.MARCHANT_ID
     *
     * @return the value of biz_asset_detail.MARCHANT_ID
     *
     * @mbggenerated
     */
    public String getMarchantId() {
        return marchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.MARCHANT_ID
     *
     * @param marchantId the value for biz_asset_detail.MARCHANT_ID
     *
     * @mbggenerated
     */
    public void setMarchantId(String marchantId) {
        this.marchantId = marchantId == null ? null : marchantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.MARCHANT_NAME
     *
     * @return the value of biz_asset_detail.MARCHANT_NAME
     *
     * @mbggenerated
     */
    public String getMarchantName() {
        return marchantName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.MARCHANT_NAME
     *
     * @param marchantName the value for biz_asset_detail.MARCHANT_NAME
     *
     * @mbggenerated
     */
    public void setMarchantName(String marchantName) {
        this.marchantName = marchantName == null ? null : marchantName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.CHANNEL_TARGET
     *
     * @return the value of biz_asset_detail.CHANNEL_TARGET
     *
     * @mbggenerated
     */
    public String getChannelTarget() {
        return channelTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.CHANNEL_TARGET
     *
     * @param channelTarget the value for biz_asset_detail.CHANNEL_TARGET
     *
     * @mbggenerated
     */
    public void setChannelTarget(String channelTarget) {
        this.channelTarget = channelTarget == null ? null : channelTarget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.CHANNEL_TARGET_NAME
     *
     * @return the value of biz_asset_detail.CHANNEL_TARGET_NAME
     *
     * @mbggenerated
     */
    public String getChannelTargetName() {
        return channelTargetName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.CHANNEL_TARGET_NAME
     *
     * @param channelTargetName the value for biz_asset_detail.CHANNEL_TARGET_NAME
     *
     * @mbggenerated
     */
    public void setChannelTargetName(String channelTargetName) {
        this.channelTargetName = channelTargetName == null ? null : channelTargetName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.ASSET_APPLY_TIME
     *
     * @return the value of biz_asset_detail.ASSET_APPLY_TIME
     *
     * @mbggenerated
     */
    public Date getAssetApplyTime() {
        return assetApplyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.ASSET_APPLY_TIME
     *
     * @param assetApplyTime the value for biz_asset_detail.ASSET_APPLY_TIME
     *
     * @mbggenerated
     */
    public void setAssetApplyTime(Date assetApplyTime) {
        this.assetApplyTime = assetApplyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.INSTALLMENT_APPLY_TIME
     *
     * @return the value of biz_asset_detail.INSTALLMENT_APPLY_TIME
     *
     * @mbggenerated
     */
    public Date getInstallmentApplyTime() {
        return installmentApplyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.INSTALLMENT_APPLY_TIME
     *
     * @param installmentApplyTime the value for biz_asset_detail.INSTALLMENT_APPLY_TIME
     *
     * @mbggenerated
     */
    public void setInstallmentApplyTime(Date installmentApplyTime) {
        this.installmentApplyTime = installmentApplyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.INTEREST
     *
     * @return the value of biz_asset_detail.INTEREST
     *
     * @mbggenerated
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.INTEREST
     *
     * @param interest the value for biz_asset_detail.INTEREST
     *
     * @mbggenerated
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.AMOUNT
     *
     * @return the value of biz_asset_detail.AMOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.AMOUNT
     *
     * @param amount the value for biz_asset_detail.AMOUNT
     *
     * @mbggenerated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.NOTE
     *
     * @return the value of biz_asset_detail.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.NOTE
     *
     * @param note the value for biz_asset_detail.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.STATUS
     *
     * @return the value of biz_asset_detail.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.STATUS
     *
     * @param status the value for biz_asset_detail.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.CREATE_TIME
     *
     * @return the value of biz_asset_detail.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.CREATE_TIME
     *
     * @param createTime the value for biz_asset_detail.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.UPDATE_TIME
     *
     * @return the value of biz_asset_detail.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.UPDATE_TIME
     *
     * @param updateTime the value for biz_asset_detail.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.CREATOR_ID
     *
     * @return the value of biz_asset_detail.CREATOR_ID
     *
     * @mbggenerated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.CREATOR_ID
     *
     * @param creatorId the value for biz_asset_detail.CREATOR_ID
     *
     * @mbggenerated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.UPDATER_ID
     *
     * @return the value of biz_asset_detail.UPDATER_ID
     *
     * @mbggenerated
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.UPDATER_ID
     *
     * @param updaterId the value for biz_asset_detail.UPDATER_ID
     *
     * @mbggenerated
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.CREATOR_NAME
     *
     * @return the value of biz_asset_detail.CREATOR_NAME
     *
     * @mbggenerated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.CREATOR_NAME
     *
     * @param creatorName the value for biz_asset_detail.CREATOR_NAME
     *
     * @mbggenerated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset_detail.UPDATER_NAME
     *
     * @return the value of biz_asset_detail.UPDATER_NAME
     *
     * @mbggenerated
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset_detail.UPDATER_NAME
     *
     * @param updaterName the value for biz_asset_detail.UPDATER_NAME
     *
     * @mbggenerated
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }
}