package com.mahendra;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/loans")
@Produces({"application/json","application/xml"})
public class LoanResource {

	@GET
	public List<Loan> loans(){
		List<Loan> loans = new LinkedList<>();
		loans.add(new Loan("LN1223", "Akshay Kumar", 123000, 12000));
		loans.add(new Loan("LN1224", "Tigor shroff", 73000, 7000));	
		return loans;
	}
	
	@GET @Path("/{id}")
	public Response findLoan(@PathParam("id") String loanId) {
		System.out.println("Parameter : "+loanId);
		if(loanId.startsWith("LN")) {
			Loan ln = new Loan(loanId, "Unknown", 120000, 9800);
			return Response.ok(ln).build();
		}else {
			return Response.status(404).entity("The loan details not found !").type("text/plain").build();
		}
	}
	
	@POST
	@Consumes({"application/xml","application/json"})
	public Response create(Loan loan) {
		System.out.println("Processing loan "+loan.getLoanId());
		System.out.println("Customer : "+loan.getCustomer());
		return Response.status(201).entity("Record created").type("text/plain").build();
	}
	
	@DELETE 
	public Response deleteLoan(@QueryParam("loanid") String loanId) {
		System.out.println("The loan to be closed : "+loanId);
		return Response.ok("Loan closed").build();
	}
}
