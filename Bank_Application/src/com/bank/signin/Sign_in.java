package com.bank.signin;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sign_in {

	int cut_id;
	public Sign_in(){
		
	}
	Sign_in(int cut_id){
		this.cut_id=cut_id;
	}
	Boolean verify_id(int i) {
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
	
		boolean found = false;
	
		try {
			fr=new FileReader("Bank_Data.txt");
			br =new BufferedReader(fr);
			String data=br.readLine();
			while(data != null) {
				 st=new StringTokenizer(data,"#");
				 while(st.hasMoreElements()) {
					 String id=st.nextToken();
					 String name=st.nextToken();
					 String nu=st.nextToken();
					 String det=st.nextToken();
					 int id_cut=Integer.parseInt(id);
					if(id_cut==i) {
					 found=true;
							break;
						}
						else {
							continue;
						}
					 }
//				 }
				 data=br.readLine();		
			}
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return found;
	
	}
	void with_dep(int id,int amount,String menu){
        if(amount!=0){
        With_Dep wd;
        wd = new With_Dep(id,amount,menu);
        try {
			wd.with_dep();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    }

    
	void update(int id,long amount3,String menu){
		 With_Dep wd;
	        wd = new With_Dep(id,amount3,menu);
	        try {
				wd.update();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
	void report(int id){
		With_Dep wd;
        wd = new With_Dep(id,0,null);
        wd.report();
    }
	public void display(){	
		int exit = -1;
		do {
		
		System.out.println("enter id = ");
		Scanner my=new Scanner(System.in);
		int i_id=my.nextInt();
		
		boolean verify = verify_id(i_id);
		if(verify==true) {
			System.out.println("----- The ID is valid you can check the main -----\n");
			int choice=-1;
			do {
			System.out.println("\t****** WELCOME TO RB GROUP BANK ******\n");
			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAWAL");
			System.out.println("3. UPDATE");
			System.out.println("4. REPORTS");
			System.out.println("5. Exit");
			choice=my.nextInt();
			switch(choice) {
			case 1:
				System.out.println("----------------------------------");
                System.out.print("Enter an amount to deposit: ");
                int amount=my.nextInt();
                with_dep(i_id,amount,"deposit");
                System.out.println("Amount successfully credited in you account...");
              System.out.println("\n");                    //Only use if you want extra space of one row
                System.out.println("----------------------------------");
				break;
			case 2:
				System.out.println("----------------------------------");
                System.out.print("Enter an amount to withdraw: ");
                int amount2=my.nextInt();
                with_dep(i_id,amount2,"withdraw");
                System.out.println("Amount successfully debited from your account...");
                System.out.println("\n");
                System.out.println("----------------------------------");
				break;
			case 3:
				System.out.println("----------------------------------");
                System.out.print(" Enter the mobile new number :-");
                long amount3=my.nextLong();
                update(i_id, amount3,"update");
                System.out.println("Sucessfully Update ...");
                System.out.println("\n");
                System.out.println("----------------------------------");
				break;
			case 4:
				System.out.println("----------------------------------");
                
                report(i_id);
  
                System.out.println("----------------------------------");
				break;
			case 5:
				System.out.println("***********************************");
                break;
			default:
				System.out.println("YOU INTER WRONG CHOICE");
				break;
			}
				
			}while(choice!=5);
		       System.out.println("Thank You");
			break;
		}
		else {
	
			System.out.println("invaild ID");
			System.out.println("IF you want to EXIT press 0 ,else to retry press 1 =");
			exit=my.nextInt();
		    }
			}while(exit != 0);
	}
	
}
