package com.exception.customException;

import java.util.List;

public class ValidationException extends RuntimeException{
	List<ValidationError> validationErrorList;
	
	
	public ValidationException(List<ValidationError> validationErrorList, String message) {
		super(message);
		this.validationErrorList = validationErrorList;
	}

	public List<ValidationError> getValidationErrorList() {
		return validationErrorList;
	}


	public void setValidationErrorList(List<ValidationError> validationErrorList) {
		this.validationErrorList = validationErrorList;
	}
	
}
