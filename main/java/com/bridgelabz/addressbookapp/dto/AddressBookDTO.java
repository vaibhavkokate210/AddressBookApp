package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;

public class AddressBookDTO 
{
	@NotEmpty(message="First name can not be null")
	public String firstName;
	@NotEmpty(message="Last name can not be null")
	public String lastName;
	@NotEmpty(message="Address can not be null")
	public String address;
	@NotEmpty(message="City can not be null")
	public String city;
	@NotEmpty(message="State can not be null")
	public String state;
	
	public AddressBookDTO(String firstName, String lastName, String address, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressBookDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state  + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	
}
