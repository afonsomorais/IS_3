package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ListSubscriptions {
	@WebMethod
	public String getList(){
		return "Hello";
	}
}
