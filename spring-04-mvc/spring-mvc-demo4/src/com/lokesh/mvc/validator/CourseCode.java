package com.lokesh.mvc.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD , ElementType.FIELD})
public @interface CourseCode {

	String value() default "LUV";
	
	String message() default "Start with LUV";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
