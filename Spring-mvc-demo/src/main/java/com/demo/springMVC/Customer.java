package com.demo.springMVC;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Customer {

	private String firstName;
	@NotNull(message="required")
	@Size(min=1,message="required")
	private String lastName;
	
	@Min(value=0, message="must be greater than or eqal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private int freepass;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 digits/chars")
	private String postalCode;
	
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
	public int getFreepass() {
		return freepass;
	}
	public void setFreepass(int freepass) {
		this.freepass = freepass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
