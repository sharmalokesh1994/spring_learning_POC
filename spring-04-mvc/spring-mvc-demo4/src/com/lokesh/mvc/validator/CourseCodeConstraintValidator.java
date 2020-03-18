package com.lokesh.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{


	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix = theCourseCode.value();
	}

	
	//isValid(html form input, can add more error)
	@Override
	public boolean isValid(String theString, 
			ConstraintValidatorContext constraintValidatorContext) {
		// TODO Auto-generated method stub
		
		if(theString!=null) {
			return theString.startsWith(coursePrefix);
		}
		
		return true;
	}

}
