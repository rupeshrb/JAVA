package com.core.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cust")

public class Customer {
	@Value("101")
private String id;
	@Value("String")
private String name;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
