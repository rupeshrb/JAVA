package com.demo.results;

import com.demo.application.Demo_Package;
 
public class Demo_Abstract_Main {
	public static void main(String[] arg){
		Demo_Package ref;
		GetResults child= new GetResults(1,"java",190);
		ref=child;
		if(ref.getResult()) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
	}
}
class GetResults extends Demo_Package{
	int mks_secured;
	GetResults(int id, String name , int mks_secured){
		super(id,name);
		this.mks_secured=mks_secured;
	}
	@Override
	public boolean getResult() {
		// TODO Auto-generated method stub
		int avg=(mks_secured * 100)/MAX_MKS;
		if(avg>90)
			return true;
		else
			return false;
	}
	
}
