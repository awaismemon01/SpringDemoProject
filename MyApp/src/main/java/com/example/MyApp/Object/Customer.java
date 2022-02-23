package com.example.MyApp.Object;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.MyApp.Validation.CourseCode;

public class Customer {

	@NotNull(message = "required field")
	@Size(min = 1, message = "required field")
	private String firstName;
		
	@NotNull(message = "required field")
	@Size(min = 1, message = "required field")
	private String lastName;
	
	@NotNull(message = "required field")
	@Min(value=0, message = "Invalid entry")
	@Max(value=10, message = "Invalid entry")
	private Integer number;
	
	
	@Pattern(regexp = "^[380]{3}\\s{0,1}[0-9]{3}$", message = "Must Start with 380 and only 6 digits")
	private String postalCode;

	@CourseCode
	private String courseCode;
	
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	
	
	
}
