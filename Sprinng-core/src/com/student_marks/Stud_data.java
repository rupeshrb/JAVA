package com.student_marks;

public class Stud_data {
public Integer id;
public String name;
public Integer math;
public Integer science;
public Stud_data() {
	super();
	// TODO Auto-generated constructor stub
}
public Stud_data(Integer id, String name, Integer math, Integer science) {
	super();
	this.id = id;
	this.name = name;
	this.math = math;
	this.science = science;
}
@Override
public String toString() {
	return "Stud_data [id=" + id + ", name=" + name + ", math=" + math + ", science=" + science + "]";
}

}
