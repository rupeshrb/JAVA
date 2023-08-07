package com.Main_Display;
import com.datatype.Data_type;
import com.final_class.Final;
import com.keyword.Keyword;
import com.static_class.Static;
import com.classproperties.Class;
import com.overload_overrid.Overload_Overrid;

public class Main_Display {
	public void main(String[] arg) {
		int choice=4;
		System.out.println("Enter Choice for \n" 
				+"1) Keywords \r\n"
				+"2) Data Type \r\n"
				+"3) Class AND Object \r\n"
				+"4) Static \r\n"
				+"5) Final \r\n"
				+"6) Method overloading AND Method overriding\r\n"
				+"7) Exit");
	switch (choice){
		
		case 1:
		    Keyword key=new Keyword();
		    key.Display_Keyword();
		    break;
		  case 2:
			Data_type DT=new Data_type();
			DT.Display_Data_type();
		    break;
		  case 3:
			Class c=new Class();
			c.Display_Class_Properties();
		    break;
		  case 4:
			Static s=new Static();
			s.Display_Static();

		    break;
		  case 5:
			Final f=new Final();
			f.Display_Final();
		    break;
		  case 6:
			Overload_Overrid over=new Overload_Overrid();
		    over.Display_overload_overrid();
			break;
		  case 7:
			break;
		}
	
	}
}
