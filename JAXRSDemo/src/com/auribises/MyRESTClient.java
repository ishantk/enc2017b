package com.auribises;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class MyRESTClient {

	public static void main(String[] args) {
		
		try {
			
			ClientConfig config = new ClientConfig();
			Client client = ClientBuilder.newClient(config);
			
			WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/JAXRSDemo/").build());
			
			String plainResponse = target.path("rest").path("mywebservice").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			String xmlResponse = target.path("rest").path("mywebservice").request().accept(MediaType.TEXT_XML).get(String.class);
			String htmlResponse = target.path("rest").path("mywebservice").request().accept(MediaType.TEXT_HTML).get(String.class);
			String jsonResponse = target.path("rest").path("mywebservice").request().accept(MediaType.APPLICATION_JSON).get(String.class);
			
			System.out.println(plainResponse);
			System.out.println("--------------------------------------------------");
			System.out.println(xmlResponse);
			System.out.println("--------------------------------------------------");
			System.out.println(htmlResponse);
			System.out.println("--------------------------------------------------");
			System.out.println(jsonResponse);
			System.out.println("--------------------------------------------------");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}

	}

}
