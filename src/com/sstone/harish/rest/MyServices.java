package com.sstone.harish.rest;
 
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rs")
public class MyServices extends ResourceConfig 
{
    public MyServices() {
        packages("com.fasterxml.jackson.jaxrs.json");
     //   packages("com.sstone.harish.rest");
        packages("com.sstone.harish.rest");
    }
}