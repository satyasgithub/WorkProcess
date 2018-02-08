package com.sstone.harish.rest;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class OrderReq implements Serializable {
	private static final long serialVersionUID = 32345960L;
    private Customer customer;
    private Product[] products;
    
    public OrderReq(Customer cust, Product[] prods)
    {
    	this.customer = cust;
    	this.products = prods;
    }
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "OrderReq [customer=" + customer + ", products=" + Arrays.toString(products) + "]";
	}
	

    
}
