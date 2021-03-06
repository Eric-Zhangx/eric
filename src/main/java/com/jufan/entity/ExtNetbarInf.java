package com.jufan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ExtNetbarInf {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.APPLY_ID
     *
     * @mbggenerated
     */
    private String applyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_NAME
     *
     * @mbggenerated
     */
    private String netbarName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_ADDRESS
     *
     * @mbggenerated
     */
    private String netbarAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_AREA
     *
     * @mbggenerated
     */
    private BigDecimal netbarArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_LICENSE_CODE
     *
     * @mbggenerated
     */
    private String netbarLicenseCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_REPRE_NAME
     *
     * @mbggenerated
     */
    private String netbarRepreName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_SOFT_NAME
     *
     * @mbggenerated
     */
    private String netbarSoftName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_SOFT_ACCOUNT
     *
     * @mbggenerated
     */
    private String netbarSoftAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_FEE_SOFT_NAME
     *
     * @mbggenerated
     */
    private String netbarFeeSoftName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_FEE_SOFT_ACCOUNT
     *
     * @mbggenerated
     */
    private String netbarFeeSoftAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_COMPUTER_NUM
     *
     * @mbggenerated
     */
    private Integer netbarComputerNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_TYPE
     *
     * @mbggenerated
     */
    private String netbarType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_OUTCOME
     *
     * @mbggenerated
     */
    private BigDecimal netbarOutcome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.NETBAR_INCOME
     *
     * @mbggenerated
     */
    private BigDecimal netbarIncome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.CREATOR_ID
     *
     * @mbggenerated
     */
    private String creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.UPDATER_ID
     *
     * @mbggenerated
     */
    private String updaterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.CREATOR_NAME
     *
     * @mbggenerated
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.UPDATER_NAME
     *
     * @mbggenerated
     */
    private String updaterName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ext_netbar_inf.EVALUATION_ACCOUNT
     *
     * @mbggenerated
     */
    private String evaluationAccount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.ID
     *
     * @return the value of ext_netbar_inf.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.ID
     *
     * @param id the value for ext_netbar_inf.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.APPLY_ID
     *
     * @return the value of ext_netbar_inf.APPLY_ID
     *
     * @mbggenerated
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.APPLY_ID
     *
     * @param applyId the value for ext_netbar_inf.APPLY_ID
     *
     * @mbggenerated
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_NAME
     *
     * @return the value of ext_netbar_inf.NETBAR_NAME
     *
     * @mbggenerated
     */
    public String getNetbarName() {
        return netbarName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_NAME
     *
     * @param netbarName the value for ext_netbar_inf.NETBAR_NAME
     *
     * @mbggenerated
     */
    public void setNetbarName(String netbarName) {
        this.netbarName = netbarName == null ? null : netbarName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_ADDRESS
     *
     * @return the value of ext_netbar_inf.NETBAR_ADDRESS
     *
     * @mbggenerated
     */
    public String getNetbarAddress() {
        return netbarAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_ADDRESS
     *
     * @param netbarAddress the value for ext_netbar_inf.NETBAR_ADDRESS
     *
     * @mbggenerated
     */
    public void setNetbarAddress(String netbarAddress) {
        this.netbarAddress = netbarAddress == null ? null : netbarAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_AREA
     *
     * @return the value of ext_netbar_inf.NETBAR_AREA
     *
     * @mbggenerated
     */
    public BigDecimal getNetbarArea() {
        return netbarArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_AREA
     *
     * @param netbarArea the value for ext_netbar_inf.NETBAR_AREA
     *
     * @mbggenerated
     */
    public void setNetbarArea(BigDecimal netbarArea) {
        this.netbarArea = netbarArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_LICENSE_CODE
     *
     * @return the value of ext_netbar_inf.NETBAR_LICENSE_CODE
     *
     * @mbggenerated
     */
    public String getNetbarLicenseCode() {
        return netbarLicenseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_LICENSE_CODE
     *
     * @param netbarLicenseCode the value for ext_netbar_inf.NETBAR_LICENSE_CODE
     *
     * @mbggenerated
     */
    public void setNetbarLicenseCode(String netbarLicenseCode) {
        this.netbarLicenseCode = netbarLicenseCode == null ? null : netbarLicenseCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_REPRE_NAME
     *
     * @return the value of ext_netbar_inf.NETBAR_REPRE_NAME
     *
     * @mbggenerated
     */
    public String getNetbarRepreName() {
        return netbarRepreName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_REPRE_NAME
     *
     * @param netbarRepreName the value for ext_netbar_inf.NETBAR_REPRE_NAME
     *
     * @mbggenerated
     */
    public void setNetbarRepreName(String netbarRepreName) {
        this.netbarRepreName = netbarRepreName == null ? null : netbarRepreName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_SOFT_NAME
     *
     * @return the value of ext_netbar_inf.NETBAR_SOFT_NAME
     *
     * @mbggenerated
     */
    public String getNetbarSoftName() {
        return netbarSoftName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_SOFT_NAME
     *
     * @param netbarSoftName the value for ext_netbar_inf.NETBAR_SOFT_NAME
     *
     * @mbggenerated
     */
    public void setNetbarSoftName(String netbarSoftName) {
        this.netbarSoftName = netbarSoftName == null ? null : netbarSoftName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_SOFT_ACCOUNT
     *
     * @return the value of ext_netbar_inf.NETBAR_SOFT_ACCOUNT
     *
     * @mbggenerated
     */
    public String getNetbarSoftAccount() {
        return netbarSoftAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_SOFT_ACCOUNT
     *
     * @param netbarSoftAccount the value for ext_netbar_inf.NETBAR_SOFT_ACCOUNT
     *
     * @mbggenerated
     */
    public void setNetbarSoftAccount(String netbarSoftAccount) {
        this.netbarSoftAccount = netbarSoftAccount == null ? null : netbarSoftAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_FEE_SOFT_NAME
     *
     * @return the value of ext_netbar_inf.NETBAR_FEE_SOFT_NAME
     *
     * @mbggenerated
     */
    public String getNetbarFeeSoftName() {
        return netbarFeeSoftName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_FEE_SOFT_NAME
     *
     * @param netbarFeeSoftName the value for ext_netbar_inf.NETBAR_FEE_SOFT_NAME
     *
     * @mbggenerated
     */
    public void setNetbarFeeSoftName(String netbarFeeSoftName) {
        this.netbarFeeSoftName = netbarFeeSoftName == null ? null : netbarFeeSoftName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_FEE_SOFT_ACCOUNT
     *
     * @return the value of ext_netbar_inf.NETBAR_FEE_SOFT_ACCOUNT
     *
     * @mbggenerated
     */
    public String getNetbarFeeSoftAccount() {
        return netbarFeeSoftAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_FEE_SOFT_ACCOUNT
     *
     * @param netbarFeeSoftAccount the value for ext_netbar_inf.NETBAR_FEE_SOFT_ACCOUNT
     *
     * @mbggenerated
     */
    public void setNetbarFeeSoftAccount(String netbarFeeSoftAccount) {
        this.netbarFeeSoftAccount = netbarFeeSoftAccount == null ? null : netbarFeeSoftAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_COMPUTER_NUM
     *
     * @return the value of ext_netbar_inf.NETBAR_COMPUTER_NUM
     *
     * @mbggenerated
     */
    public Integer getNetbarComputerNum() {
        return netbarComputerNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_COMPUTER_NUM
     *
     * @param netbarComputerNum the value for ext_netbar_inf.NETBAR_COMPUTER_NUM
     *
     * @mbggenerated
     */
    public void setNetbarComputerNum(Integer netbarComputerNum) {
        this.netbarComputerNum = netbarComputerNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_TYPE
     *
     * @return the value of ext_netbar_inf.NETBAR_TYPE
     *
     * @mbggenerated
     */
    public String getNetbarType() {
        return netbarType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_TYPE
     *
     * @param netbarType the value for ext_netbar_inf.NETBAR_TYPE
     *
     * @mbggenerated
     */
    public void setNetbarType(String netbarType) {
        this.netbarType = netbarType == null ? null : netbarType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_OUTCOME
     *
     * @return the value of ext_netbar_inf.NETBAR_OUTCOME
     *
     * @mbggenerated
     */
    public BigDecimal getNetbarOutcome() {
        return netbarOutcome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_OUTCOME
     *
     * @param netbarOutcome the value for ext_netbar_inf.NETBAR_OUTCOME
     *
     * @mbggenerated
     */
    public void setNetbarOutcome(BigDecimal netbarOutcome) {
        this.netbarOutcome = netbarOutcome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.NETBAR_INCOME
     *
     * @return the value of ext_netbar_inf.NETBAR_INCOME
     *
     * @mbggenerated
     */
    public BigDecimal getNetbarIncome() {
        return netbarIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.NETBAR_INCOME
     *
     * @param netbarIncome the value for ext_netbar_inf.NETBAR_INCOME
     *
     * @mbggenerated
     */
    public void setNetbarIncome(BigDecimal netbarIncome) {
        this.netbarIncome = netbarIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.STATUS
     *
     * @return the value of ext_netbar_inf.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.STATUS
     *
     * @param status the value for ext_netbar_inf.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.CREATE_TIME
     *
     * @return the value of ext_netbar_inf.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.CREATE_TIME
     *
     * @param createTime the value for ext_netbar_inf.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.UPDATE_TIME
     *
     * @return the value of ext_netbar_inf.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.UPDATE_TIME
     *
     * @param updateTime the value for ext_netbar_inf.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.CREATOR_ID
     *
     * @return the value of ext_netbar_inf.CREATOR_ID
     *
     * @mbggenerated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.CREATOR_ID
     *
     * @param creatorId the value for ext_netbar_inf.CREATOR_ID
     *
     * @mbggenerated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.UPDATER_ID
     *
     * @return the value of ext_netbar_inf.UPDATER_ID
     *
     * @mbggenerated
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.UPDATER_ID
     *
     * @param updaterId the value for ext_netbar_inf.UPDATER_ID
     *
     * @mbggenerated
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.CREATOR_NAME
     *
     * @return the value of ext_netbar_inf.CREATOR_NAME
     *
     * @mbggenerated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.CREATOR_NAME
     *
     * @param creatorName the value for ext_netbar_inf.CREATOR_NAME
     *
     * @mbggenerated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.UPDATER_NAME
     *
     * @return the value of ext_netbar_inf.UPDATER_NAME
     *
     * @mbggenerated
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.UPDATER_NAME
     *
     * @param updaterName the value for ext_netbar_inf.UPDATER_NAME
     *
     * @mbggenerated
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ext_netbar_inf.EVALUATION_ACCOUNT
     *
     * @return the value of ext_netbar_inf.EVALUATION_ACCOUNT
     *
     * @mbggenerated
     */
    public String getEvaluationAccount() {
        return evaluationAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ext_netbar_inf.EVALUATION_ACCOUNT
     *
     * @param evaluationAccount the value for ext_netbar_inf.EVALUATION_ACCOUNT
     *
     * @mbggenerated
     */
    public void setEvaluationAccount(String evaluationAccount) {
        this.evaluationAccount = evaluationAccount == null ? null : evaluationAccount.trim();
    }
}