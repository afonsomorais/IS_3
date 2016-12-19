package soap;

import java.util.Hashtable;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService/*(endpointInterface = "src//main//java//assignment3.MyWebService",
serviceName = "MyWebService")*/
public class Subscription {
	@WebMethod
	public String setParams(String email, String course){
		return "Hello";
	}
}