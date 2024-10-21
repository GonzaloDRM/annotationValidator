package com.annotation.creation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TestStringValidator.class)
@Documented
public @interface TestStringAnnotation {

    String message() default "value '${validateValue}' must be a valid String";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
