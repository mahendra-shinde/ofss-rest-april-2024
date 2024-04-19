import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;


public class App {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8080/demo-2");
		
		Loan loan = client.accept("application/json").path("/api/v1/loans").get(Loan.class);
		
		String out =  respo.readEntity(String.class);
		System.out.println("Response : "+out);
		
		client.close();

	}

}
