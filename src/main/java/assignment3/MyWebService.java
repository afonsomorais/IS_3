package assignment3;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService/*(endpointInterface = "src//main//java//assignment3.MyWebService",
serviceName = "MyWebService")*/
public class MyWebService {
	
	@WebMethod
	public String subscribe(String email, String course){
		return "Hello "+email+", you successfully subscribed to "+course+".";
	}
}