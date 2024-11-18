package dev.ucbc.customerTest;

public class Customer {

	private String customerCode;
	private String fullName;
	private String telephone;
	
	public Customer(String customerCode, String fullName, String telephone) {
		this.customerCode = customerCode;
		this.fullName = fullName;
		this.telephone = telephone;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
