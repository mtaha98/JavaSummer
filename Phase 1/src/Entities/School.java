package Entities;

//import java.util.*;
import java.util.Vector;
import java.util.ArrayList;

public class School {
	public School (String _name, int NOS, boolean _housed) {
		setName(_name) ;
		setNumOfStudents(NOS) ;
		setHoused(_housed) ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfStudents() {
		return NumOfStudents;
	}
	public void setNumOfStudents(int numOfStudents) {
		NumOfStudents = numOfStudents;
	}
	public boolean getHoused() {
		return housed ;
	}
	public void setHoused(boolean housed) {
		this.housed = housed ;
	}
	public ArrayList<String> getHouseNames() {
		return houseNames;
	}
	public void setHouseNames(ArrayList<String> houseNames) {
		this.houseNames = houseNames;
	}
	public Vector<String> getProfessorNames() {
		return professorNames;
	}
	public void setProfessorNames(Vector<String> professorNames) {
		this.professorNames = professorNames;
	}
	public ArrayList<String> getCourseNames() {
		return courseNames;
	}
	public void setCourseNames(ArrayList<String> courseNames) {
		this.courseNames = courseNames;
	}
	private String name ;
	private int NumOfStudents ;
	private boolean housed ;
	private ArrayList<String> houseNames ;
	private Vector<String> professorNames ;
	private ArrayList<String> courseNames ;
}
