package com.sstone.harish.rest;

import java.io.Serializable;
import java.util.ArrayList;


public class Customer implements Serializable{
	 private static final long serialVersionUID = 459601L;
	 
	 private String customer_id;
	 private String name;
	 
	 public Customer(String id, String name)
	 {
		 this.customer_id =id;
		 this.name = name;
	 }
	 
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + "]";
	}
	
	 
}
