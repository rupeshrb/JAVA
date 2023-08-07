package com.demo.application;

abstract public class Demo_Package {
	private int enroll_id;
	private String enrollName;
	   public final int MAX_MKS=200;
	   
	    public Demo_Package(int enroll_id , String enrollName){
	    	super();
	    	this.enroll_id=enroll_id;
	    	this.enrollName=enrollName;
	    
	    	                
	    	}
	    	public Demo_Package(){
	    	}
	    	abstract public boolean getResult();	
}

	   
