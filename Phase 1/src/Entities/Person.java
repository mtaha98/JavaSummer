package Entities;

import java.util.Date;

public class Person {
	public Person(String name, String houseName, String bloodStatus, String school, Date birthday) {
		setName(name) ;
		setHouseName(houseName) ;
		setBloodStatus(bloodStatus) ;
		setSchool(school) ;
		setBirthday(birthday) ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getBloodStatus() {
		return bloodStatus;
	}
	public void setBloodStatus(String bloodStatus) {
		this.bloodStatus = bloodStatus;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	private String name ;
	private String houseName ;
	private String bloodStatus ;
	private String school ;
	private Date birthday ;
}
