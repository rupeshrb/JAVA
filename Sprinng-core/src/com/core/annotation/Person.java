package com.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per1")
public class Person {
@Value("gopal")
String per_name;
@Autowired
private Address addr;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [per_name=" + per_name + ", addr=" + addr + "]";
}

}
