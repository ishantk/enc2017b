package com.auribises;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer;

@Path("/mywebservice")
public class MyWebService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		String str = "Hello, Its: "+new Date();
		return str;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloInXML(){
		String str = "<hello>This is a Hello from XML</hello>";
		return str;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloInHTML(){
		String str = "<html><body><b>This is a Hello from HTML</b></body></html>";
		return str;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloInJSON(){
		String str = "{ \"name\":\"John\", \"age\":31, \"city\":\"New York\" }";
		return str;
	}
}
