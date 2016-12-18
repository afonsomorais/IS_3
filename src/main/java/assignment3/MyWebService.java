package assignment3;

import java.util.Hashtable;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService/*(endpointInterface = "src//main//java//assignment3.MyWebService",
serviceName = "MyWebService")*/
public class MyWebService {
	static private Map<String, String> student_course = new Hashtable<>();

	public MyWebService(){
	}
	
	@WebMethod
	public String subscribe(String email, String course){
		return "Hello "+email+", you successfully subscribed to "+course+".";
	}
	
	@WebMethod
	public String getNumero(String name) throws NoSuchPersonException {
		if (!student_course.containsKey(name))
			throw new NoSuchPersonException();
		return student_course.get(name);
	}
	
	@WebMethod
	public void setNumero(String name, String course) {
		student_course.put(name, course);
	}
}