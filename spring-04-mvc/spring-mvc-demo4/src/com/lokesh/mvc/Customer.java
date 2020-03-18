package com.lokesh.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.lokesh.mvc.validator.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull
	@Size(min=1 , message="is Required")
	private String lastName;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message="Only 6 char allowed")
	private String postalCode;
	
	@NotNull(message="is req")
	@Min(value=1, message="Min val is 1")
	@Max(value=10, message="Max val is 10")
	private Integer freepass;
	
	
	@CourseCode
	private String courseCode;
	

	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreepass() {
		return freepass;
	}
	public void setFreepass(Integer freepass) {
		this.freepass = freepass;
	}
	
	
	

}
