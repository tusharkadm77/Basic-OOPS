package com.exception.customException;

import java.util.ArrayList;
import java.util.List;

public class AppClient {

	public static void main(String... str) {
		
		try {
			createAccount();
		} catch (ValidationException exception) {
			for(ValidationError error: exception.getValidationErrorList()) {
				System.out.println(""+ error.getFieldName() + "  - "+error.getErrorType());
			}
		}
	}
	
	
	private static void createAccount() {
		ValidationError validationError = new ValidationError("AccountName", "Already Exists");
		
		ValidationError validationError1 = new ValidationError("Amount", "Invalid Value");
		
		List<ValidationError> validationErrorList = new ArrayList<ValidationError>();
		validationErrorList.add(validationError);
		validationErrorList.add(validationError1);
		
		throw new ValidationException(validationErrorList, "Validation Error");
	}
	
	
}
