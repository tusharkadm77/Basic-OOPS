package com.exception.customException;

public class ValidationError {

	private String fieldName;
	
	private String errorType;
	
	public ValidationError(String fieldName, String errorType) {
		this.fieldName = fieldName;
		this.errorType = errorType;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	
	
}
