package com.jufan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizTmpPayInf {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset.BIZ_TYPE
     *
     * @mbggenerated
     */
    private String jfOrderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset.BIZ_TYPE_NAME
     *
     * @mbggenerated
     */
    private String pbean;




    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

  

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset.CREATOR_ID
     *
     * @mbggenerated
     */
    private String creatorId;

  

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_asset.CREATOR_NAME
     *
     * @mbggenerated
     */
    private String creatorName;

 

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset.ID
     *
     * @return the value of biz_asset.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset.ID
     *
     * @param id the value for biz_asset.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset.BIZ_TYPE
     *
     * @return the value of biz_asset.BIZ_TYPE
     *
     * @mbggenerated
     */
    public String getJfOrderNo() {
        return jfOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset.BIZ_TYPE
     *
     * @param bizType the value for biz_asset.BIZ_TYPE
     *
     * @mbggenerated
     */
    public void setJfOrderNo(String jfOrderNo) {
        this.jfOrderNo = jfOrderNo == null ? null : jfOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset.BIZ_TYPE
     *
     * @return the value of biz_asset.BIZ_TYPE
     *
     * @mbggenerated
     */
    public String getpbean() {
        return pbean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset.BIZ_TYPE
     *
     * @param bizType the value for biz_asset.BIZ_TYPE
     *
     * @mbggenerated
     */
    public void setPbean(String pbean) {
        this.pbean = pbean == null ? null : pbean.trim();
    }



  

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset.CREATE_TIME
     *
     * @return the value of biz_asset.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset.CREATE_TIME
     *
     * @param createTime the value for biz_asset.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

  



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset.CREATOR_ID
     *
     * @return the value of biz_asset.CREATOR_ID
     *
     * @mbggenerated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset.CREATOR_ID
     *
     * @param creatorId the value for biz_asset.CREATOR_ID
     *
     * @mbggenerated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

  

  

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_asset.CREATOR_NAME
     *
     * @return the value of biz_asset.CREATOR_NAME
     *
     * @mbggenerated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_asset.CREATOR_NAME
     *
     * @param creatorName the value for biz_asset.CREATOR_NAME
     *
     * @mbggenerated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

  
}