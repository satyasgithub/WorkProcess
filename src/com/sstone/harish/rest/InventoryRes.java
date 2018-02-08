package com.sstone.harish.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author Harish
 *
 */

@Path("inventory")
public class InventoryRes {
    //Dummy Data Holder
	private static OrderReq request;
    
    public InventoryRes() {
    	initializeOrder();
    }
    
    @GET
    @Path("order")
    @Produces(MediaType.APPLICATION_JSON)
    public String searchByName(@QueryParam("name") String name) {
        //Need to add the DAO to get from DB
    	System.out.println("Got the Order Request");
    	System.out.println(request);
    	System.out.println(request.toString());
        return (request.toString());
    }
    
    

    private void initializeOrder() {
    	System.out.println(request);
        if (request == null) {
        
            Product p1 = new Product ("8ed0e6f7", 1);
            Product p2 = new Product ("c0258525", 3);
            Product p3 = new Product ("0a207870", 2);
           Product [] prods = {p1,p2,p3};
           
            Customer cu = new Customer("Customer1","NewGuy");
        	request = new OrderReq(cu,prods);
            
        }
    }
}