package classes;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student{

 @JsonProperty("id") 
 private int id;
 @JsonProperty("name")
 private String name;
 @JsonProperty("password")
 private String password;
 @JsonProperty("email")
 private String email;
 @JsonProperty("alternativeEmail")
 private String alternativeEmail;
 @JsonProperty("address")
 private String address;
 @JsonProperty("telephone")
 private int telephone;
 @JsonProperty("studentID")
 private int studentID;
 @JsonProperty("startYear")
 private int startYear;
 @JsonProperty("Birth")
 private Date birth;

 @JsonProperty("courses")
private List<Course> courses;


 public Student(String name, Date birth, String email,String alternativeEmail,String address,int telephone, int studentID , int startYear, String password) throws NoSuchAlgorithmException, InvalidKeySpecException {
  this.name = name;
  this.birth = birth;
  this.email = email;
  this.alternativeEmail = alternativeEmail;
  this.address = address;
  this.telephone = telephone;
  this.startYear = startYear;
  this.studentID = studentID;
  this.password = password;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Date getBirth() {
  return birth;
 }

 public void setBirth(Date birth) {
  this.birth = birth;
 }

 public String getEmail(){
	 return email;
 }
 
 public void setEmail(String email){
	 this.email = email;
 }
 
 public String getAlternativeEmail(){
	 return alternativeEmail;
 }
 
 public void setAlternativeEmail(String alternativeEmail){
	 this.alternativeEmail = alternativeEmail;
 }
 
 public String getAddress(){
	 return address;
 }
 
 public void setAddress(String address){
	 this.address = address;
 }
 
 public int getTelephone(){
	 return telephone;
 }
 
 public void setTelephone(int telephone){
	 this.telephone = telephone;
 }
 
 public int getStudentID(){
	 return studentID;
 }
 
 public int getId(){
	 return id;
 }
 
 public void setStudentID(int studentID){
	 this.studentID = studentID;
 }
 
 public int getStartYear(){
	 return startYear;
 }
 
 public void setStartYear(int startYear){
	 this.startYear = startYear;
 }

 public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public List <Course> getCourses(){
	return this.courses;
}
public void setCourses(List <Course> courses){
	this.courses = courses;
}
 
 @Override
 public String toString() {
  return this.name + " id = " + this.id + ". Born on " + this.birth;
 }
   
}