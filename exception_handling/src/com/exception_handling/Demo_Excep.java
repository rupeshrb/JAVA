package com.exception_handling;

public class Demo_Excep {
	public static void main(String[]args){
	    // TODO Auto-generated method stub
		int len=args.length;
		try {
		int div=10;
		int res=div/len;
		}
		catch(ArithmeticException ar) {
			ar.printStackTrace();
		}
		catch(Exception er) {
			er.printStackTrace();  
		}
		try {
		System.out.println(args[0]+""+args[1]); 
		}
		catch(ArrayIndexOutOfBoundsException aa) {
		System.out.println("index invaild");	
		}
		
		System.out.println("hi");
	try {	
		A ref=null;
		ref.disp();
		}
	catch(NullPointerException ae) {
		ae.printStackTrace();
		System.out.println("Object creation imp");
	}
//		catch(Exception e) {
//		//	e.printStackTrace();
//			System.out.println("error");
//		}
		finally {
		System.out.println("finally , i should be display");
		}
		}
	}
	class A{
		void disp(){
			System.out.println("hi");
					}
			}