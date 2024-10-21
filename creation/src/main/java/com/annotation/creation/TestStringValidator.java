package com.annotation.creation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class TestStringValidator implements ConstraintValidator<TestStringAnnotation, String> {

    private Pattern pattern;

    @Override
    public void initialize(TestStringAnnotation constraintAnnotation) {
        pattern = Pattern.compile("^[A-Za-z0-9]{4}$");
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return pattern.matcher(value).matches();
    }
}
