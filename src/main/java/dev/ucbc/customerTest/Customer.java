package dev.ucbc.customerTest;

public class Customer {

	private String customerCode;
	
	public Customer(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	
}
