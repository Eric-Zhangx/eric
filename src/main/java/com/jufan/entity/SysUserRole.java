package com.jufan.entity;

public class SysUserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.ID
     *
     * @return the value of sys_user_role.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.ID
     *
     * @param id the value for sys_user_role.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.ROLE_ID
     *
     * @return the value of sys_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.ROLE_ID
     *
     * @param roleId the value for sys_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.USER_ID
     *
     * @return the value of sys_user_role.USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.USER_ID
     *
     * @param userId the value for sys_user_role.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}