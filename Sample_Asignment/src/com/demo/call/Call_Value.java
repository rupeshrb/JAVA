package com.demo.call;
import com.demo.keyword_demo.Keywords_demo;
import com.demo.datatype_demo.Data_Type;
import java.io.IOException;
import com.demo.classpropertice_demo.ClassPropertice_demo;
import com.demo.static_demo.Static_demo;
import com.demo.final_demo.Final_Demo;
import com.demo.over_demo.Over_Demo;

public class Call_Value {

	int choice;
	public Call_Value() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Call_Value(int choice) {
		super();
		this.choice=choice;
		// TODO Auto-generated constructor stub
	}
	public void display() throws IOException {

//		int i=0;
//		while (i==1) {
		switch (choice){
		case 1:
			Keywords_demo key=new Keywords_demo();
		    key.Display_Keyword();
//		    System.out.println("For Stop Enter 1");
//		    System.out.println("For go back Enter 0");
//		    i = (int)System.in.read();
		    break;
		  case 2:
			Data_Type DT=new Data_Type();
			DT.Display_Data_type();
//			System.out.println("For Stop Enter 1");
//			System.out.println("For go back Enter 0");
//		    i = (int)System.in.read();
		    break;
		  case 3:
			ClassPropertice_demo c=new ClassPropertice_demo();
			c.Display_Class_Properties();
//			System.out.println("For Stop Enter 1");
//			System.out.println("For go back Enter 0");
//		    i = (int)System.in.read();
		    break;
		  case 4:
			Static_demo s=new Static_demo();
			s.Display_Static();
//			System.out.println("For Stop Enter 1");
//			System.out.println("For go back Enter 0");
//		    i = (int)System.in.read();
		    break;
		  case 5:
			Final_Demo f=new Final_Demo();
			f.Display_Final();
//			System.out.println("For Stop Enter 1");
//			System.out.println("For go back Enter 0");
//		    i = (int)System.in.read();
		    break;
		  case 6:
			Over_Demo over=new Over_Demo();
		    over.Display_overload_overrid();
//		    System.out.println("For Stop Enter 1");
//		    System.out.println("For go back Enter 0");
//		    i = (int)System.in.read();
			break;
		  case 7:
			 System.exit(0);
			break;
//		}
	
	}}
	}

