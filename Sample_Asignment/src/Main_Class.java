import java.io.IOException;
import java.util.Scanner;

import com.demo.call.Call_Value;

public class Main_Class {
	public static void main(String[] arg) throws IOException  {
		
		System.out.println("Enter Choice for \n" 
				+"1) Keywords \r\n"
				+"2) Data Type \r\n"
				+"3) Class AND Object \r\n"
				+"4) Static \r\n"
				+"5) Final \r\n"
				+"6) Method overloading AND Method overriding\r\n"
				+"7) Exit");
		Scanner my=new Scanner(System.in);
		int i=my.nextInt();
	   // i = (int)System.in.read();
		Call_Value result;  // reference variable
		result=new Call_Value(i);			
		result.display();// display  details
}
	}
