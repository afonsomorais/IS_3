package soap;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Subscriber {
	private String email;
	private String course;
	private int validated;
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getCourse() { return course; }
	public void setCourse(String course) { this.course = course; }
	
	public int getValidated() { return validated; }
	public void setValidated(int validated) { this.validated = validated; }
}
