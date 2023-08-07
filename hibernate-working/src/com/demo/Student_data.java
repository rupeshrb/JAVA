package com.demo;

public class Student_data {
int studId;

	public int getStudId() {
	return studId;
}

public void setStudId(int studId) {
	this.studId = studId;
}

	public Student_data() {
		// TODO Auto-generated constructor stub
	}

	public Student_data(int studId) {
		super();
		this.studId = studId;
	}
@Override
	public String toString() {
		return "Student_data [studId=" + studId + ", studName=" + studName + "]";
	}
String studName;

public String getStudName() {
	return studName;
}

public void setStudName(String studName) {
	this.studName = studName;
}

public Student_data(String studName) {
	super();
	this.studName = studName;
}
}
