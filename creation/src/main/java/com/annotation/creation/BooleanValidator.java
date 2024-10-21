package com.annotation.creation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BooleanValidator implements ConstraintValidator<BooleanAnotationValidation, Boolean>{

	@Override
	public boolean isValid(Boolean value, ConstraintValidatorContext context) {
		return value == null || Boolean.FALSE.equals(value) || Boolean.TRUE.equals(value);
	}
	
}
