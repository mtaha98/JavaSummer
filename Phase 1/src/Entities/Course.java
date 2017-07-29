package Entities;

import java.util.Vector;

public class Course {
	public Course(String name, char minGrade, String professorName, int year) {
		setName(name) ;
		setMinGrade(minGrade) ;
		setProfessorName(professorName) ;
		setYear (year) ;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getMinGrade() {
		return minGrade;
	}
	public void setMinGrade(char minGrade) {
		this.minGrade = minGrade;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Vector<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(Vector<String> studentNames) {
		this.studentNames = studentNames;
	}
	private String name ;
	private char minGrade ;
	private String professorName ;
	private int year ;
	private Vector<String> studentNames ;
}

