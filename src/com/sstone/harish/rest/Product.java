package com.sstone.harish.rest;


import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Product implements Serializable {
    private static final long serialVersionUID = 12345960L;
    private String product_id;
    private int quantity;
    
    
    public Product() {} 
    public Product(String id, int quantity) {
        this.product_id = id;
        this.quantity = quantity;
        
    }
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", quantity=" + quantity + "]";
	}
    
}