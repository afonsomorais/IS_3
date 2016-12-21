package classes;

import java.io.Serializable;

import java.util.List;

public class Course implements Serializable {

	private int id;
	private String name;
	
	private Professor professor;

	private List<Student> students;
	
	private List<Material> materials;
	
	public Course() {
		super();
	}
	
	public Course(String name, Professor professor, List<Student> students/*, List<Material> materials*/){
		this.name = name;
		this.professor = professor;
		this.students = students;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Material> getMaterials() {
		return materials;
	}

	public void setMaterials(List<Material> materials) {
		this.materials = materials;
	}
	public int getId(){
		return this.id;
	}

   
	@Override
	 public String toString() {
	  return "Course: " + this.name + " id = " + this.id + " has " + this.professor.getName()+ " as professor and has " + this.students.size() + " students";
	 }
	
}
