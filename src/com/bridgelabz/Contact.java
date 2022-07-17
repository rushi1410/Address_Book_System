package com.bridgelabz;

public class Contact {
	public Contact() {

	}

	public Contact(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber,String email )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;

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
	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}
	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}
	public String getzip() {
		return zip;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}
	public String getphoneNmuber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"firstName='" + firstName + '\'' + 
				",lastName='" + lastName + '\'' +
				",address='" + address + '\'' +
				",city='" + city + '\'' +
				",state='" + state + '\'' +
				",zip='" + zip + '\'' +
				",phoneNumber='" + phoneNumber + '\'' +
				",email='" + email + '\'' +
				'}';
	}
}
