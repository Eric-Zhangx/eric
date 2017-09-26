package com.jufan.entity;

public class BizTypeOperation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_type_operation.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_type_operation.OPERATION_TYPE
     *
     * @mbggenerated
     */
    private String operationType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_type_operation.OPERATION_TYPE_NAME
     *
     * @mbggenerated
     */
    private String operationTypeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_type_operation.ID
     *
     * @return the value of biz_type_operation.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_type_operation.ID
     *
     * @param id the value for biz_type_operation.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_type_operation.OPERATION_TYPE
     *
     * @return the value of biz_type_operation.OPERATION_TYPE
     *
     * @mbggenerated
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_type_operation.OPERATION_TYPE
     *
     * @param operationType the value for biz_type_operation.OPERATION_TYPE
     *
     * @mbggenerated
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_type_operation.OPERATION_TYPE_NAME
     *
     * @return the value of biz_type_operation.OPERATION_TYPE_NAME
     *
     * @mbggenerated
     */
    public String getOperationTypeName() {
        return operationTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_type_operation.OPERATION_TYPE_NAME
     *
     * @param operationTypeName the value for biz_type_operation.OPERATION_TYPE_NAME
     *
     * @mbggenerated
     */
    public void setOperationTypeName(String operationTypeName) {
        this.operationTypeName = operationTypeName == null ? null : operationTypeName.trim();
    }

	@Override
	public String toString() {
		return "BizTypeOperation [id=" + id + ", operationType=" + operationType + ", operationTypeName="
				+ operationTypeName + "]";
	}
    
}