package com.tnsif.constructordemo;

public class Customer {
	
	private String customername;
	private int customerid;
	private String customeradress;
	
	//default constructor
	
	Customer()
	{
		System.out.println("Default");
	}

	public Customer(String customername, int customerid, String customeradress) {
	
		this.customername = customername;
		this.customerid = customerid;
		this.customeradress = customeradress;
	}
//getter and setter
	
	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeradress() {
		return customeradress;
	}

	public void setCustomeradress(String customeradress) {
		this.customeradress = customeradress;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customerid=" + customerid + ", customeradress="
				+ customeradress + "]";
	}
	

}
