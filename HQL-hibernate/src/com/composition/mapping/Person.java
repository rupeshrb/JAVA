package com.composition.mapping;

public class Person {
int pid;
String name;
Date bDate; //including another class--composition 

@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", bDate=" + bDate + "]";
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getbDate() {
	return bDate;
}

public void setbDate(Date bDate) {
	this.bDate = bDate;
}

public Person() {
		// TODO Auto-generated constructor stub
	}

}
