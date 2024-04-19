package com.mahendra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
// Resulting PATH would be /api/v1/hello
public class HelloResource {

	@GET @Path("/htm") 
	@Produces("text/html")
	public String sayHello() {
		return "<h2>Hello World</h2>";
	}
	
	@GET @Path("/json")
	@Produces("application/json")
	public String sayJSONHello() {
		return "{\"message\":\"Hello World\"}";
	}
}
