package com.jufan.entity;

import java.util.Date;

public class CommThirdPartyReqlog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_third_party_reqlog.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_third_party_reqlog.REQUEST_TIME
     *
     * @mbggenerated
     */
    private Date requestTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_third_party_reqlog.MESSAGE
     *
     * @mbggenerated
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_third_party_reqlog.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_third_party_reqlog.CHANNEL
     *
     * @mbggenerated
     */
    private String channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comm_third_party_reqlog.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_third_party_reqlog.ID
     *
     * @return the value of comm_third_party_reqlog.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_third_party_reqlog.ID
     *
     * @param id the value for comm_third_party_reqlog.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_third_party_reqlog.REQUEST_TIME
     *
     * @return the value of comm_third_party_reqlog.REQUEST_TIME
     *
     * @mbggenerated
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_third_party_reqlog.REQUEST_TIME
     *
     * @param requestTime the value for comm_third_party_reqlog.REQUEST_TIME
     *
     * @mbggenerated
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_third_party_reqlog.MESSAGE
     *
     * @return the value of comm_third_party_reqlog.MESSAGE
     *
     * @mbggenerated
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_third_party_reqlog.MESSAGE
     *
     * @param message the value for comm_third_party_reqlog.MESSAGE
     *
     * @mbggenerated
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_third_party_reqlog.TYPE
     *
     * @return the value of comm_third_party_reqlog.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_third_party_reqlog.TYPE
     *
     * @param type the value for comm_third_party_reqlog.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_third_party_reqlog.CHANNEL
     *
     * @return the value of comm_third_party_reqlog.CHANNEL
     *
     * @mbggenerated
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_third_party_reqlog.CHANNEL
     *
     * @param channel the value for comm_third_party_reqlog.CHANNEL
     *
     * @mbggenerated
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comm_third_party_reqlog.STATUS
     *
     * @return the value of comm_third_party_reqlog.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comm_third_party_reqlog.STATUS
     *
     * @param status the value for comm_third_party_reqlog.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}