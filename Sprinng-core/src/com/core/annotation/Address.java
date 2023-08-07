package com.core.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component()
//@Component("addr")
public class Address {
@Value("pune")
String city;
@Value("12345")
String pin;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [city=" + city + ", pin=" + pin + "]";
}
}
