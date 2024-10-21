package com.annotation.creation;

import java.lang.annotation.ElementType;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BooleanValidator.class)
@Documented
public @interface BooleanAnotationValidation {
	
	String message() default "wrong type of boolean";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
