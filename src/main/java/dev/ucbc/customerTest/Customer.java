package dev.ucbc.customerTest;

public class Customer {

	private String customerCode;
	private String fullName;
	
	public Customer(String customerCode, String fullName) {
		this.customerCode = customerCode;
		this.fullName = fullName;
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
	
}
