package com.mahendra;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.cxf.jaxrs.client.WebClient;

public class App {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8080/demo-2");
		//Loan[] loan = client.accept("application/json").path("/api/v1/loans").get(Loan[].class);
		Response resp = client.accept("application/json").path("/api/v1/loans").get();
		System.out.println("Status " + resp.getStatusInfo().getReasonPhrase());
		
		if(resp.getStatus()==200) {
			Loan[] loans = resp.readEntity(Loan[].class);
			
			for(Loan ln : loans) {
				System.out.println("Loan of "+ln.getDisbursedAmount()+" to "+ln.getCustomer());
			}
			
		}else {
			String error = resp.readEntity(String.class);
			System.out.println("Error : "+ error);
		}
			
		
		client.close();

	}

}
