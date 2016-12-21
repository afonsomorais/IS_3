package classes;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Material
 *
 */
public class Material implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String type;
	private String description;
	private String path;

	private byte[] bytes;

	private Course course;
	
	public Material() {
		super();
	}
	
	public Material(String name, String type, String description, Course course, String path){
		this.name = name;
		this.type = type;
		this.description = description;
		this.course = course;
		this.path = path;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
   
	@Override
	public String toString() {
	  return "Material: " + this.name + " id = " + this.id + " has type of " + this.type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
}
