package assignment3;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyWebService {
	
	@WebMethod
	public String subscribe(String email, String course){
		return "Hello "+email+", you successfully subsribed to "+course+".";
	}
}
