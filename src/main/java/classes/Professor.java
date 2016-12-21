package classes;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
public class Professor implements Serializable {
 private static final long serialVersionUID = 1L;
 private int id;
 private String name;
 private String login;
 private String password;
 private String email;
 private String alternativeEmail;
 private String address;
 private int telephone;
 private int professorID; 
 private String category;
 private String office;
 private int internalTelephoneNumber;
 private int salary;

 private Date birth;
 
 private List <Course> courses;

 public Professor() {
  super();
 }

 public Professor(String name, String login, Date birth,String email,String alternativeEmail,String address,int telephone, int internalTelephoneNumber, int professorID,String category,String office,int salary, String password/*, List <Course> courses*/) throws NoSuchAlgorithmException, InvalidKeySpecException {
  super();
  this.name = name;
  this.login = login;
  this.birth = birth;
  this.email = email;
  this.alternativeEmail = alternativeEmail;
  this.address = address;
  this.telephone = telephone;
  this.professorID = professorID;
  this.category = category;
  this.office = office;
  this.internalTelephoneNumber = internalTelephoneNumber;
  this.salary = salary;
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
 
 public int getProfessorID(){
	 return professorID;
 }
 
 public void setProfessorID(int professorID){
	 this.professorID = professorID;
 }
 
 public String getCategory(){
	 return category;
 }
 
 public void setCategory(String category){
	 this.category = category;
 }
 
 public String getOffice(){
	 return office;
 }
 
 public void setOffice(String office){
	 this.office= office;
 }
 
 public int getInternalTelephoneNumber(){
	 return internalTelephoneNumber;
 }
 
 public void setInternalTelephoneNumber(int internalTelephoneNumber){
	 this.internalTelephoneNumber = internalTelephoneNumber;
 }
 
 public int getSalary(){
	 return salary;
 }
 
 public void setSalary(int salary){
	 this.salary = salary;
 }
 
 public List <Course> getCourses(){
	 return courses;
 }
 
 public void setCourses(List <Course> courses){
	 this.courses = courses;
 }

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getId(){
	return id;
}
 
 public static long getSerialversionuid() {
  return serialVersionUID;
 }
 
 @Override
 public String toString() {
  return this.name + " id = " + this.id + ". Born on " + this.birth;
 }

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public void setId(int id) {
	this.id = id;
}

   
}
