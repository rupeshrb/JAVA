package com.bank.signin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class With_Dep {

	int id;
	long amount_num ;
	String menu_report;

	With_Dep(){
		
	}
	public With_Dep(Integer id, long amount_num, String menu_report) {
		super();
		this.id = id;
		this.amount_num = amount_num;
		this.menu_report = menu_report;
	}
	void report() {
		FileWriter fw=null;
		BufferedReader br;
		try {
			fw=new FileWriter("report.txt",true);
			br=new BufferedReader(new InputStreamReader(System.in));
			
			//write data into the text file
			String id_int = String.valueOf(id);
			System.out.println("Write Report of this application := ");
			String menu_report=br.readLine();
			fw.write(id_int);
			fw.write("#");
			fw.write(menu_report);
			fw.write("\n");	  
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				fw.close();
				System.out.println("\n \n\t**** Your Report has been Recorded ****");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	void update() throws IOException {
		FileReader fr;
		FileWriter fw=null;
		BufferedReader br;
		StringTokenizer st;
		Scanner my=new Scanner(System.in);
		List<CutomerData> li= new ArrayList<CutomerData>();
		CutomerData cd;
		String data;
			try {
				fr= new FileReader("Bank_Data.txt");
				br= new BufferedReader(fr);
				
				data =br.readLine();
				while(data!=null) {
					st=new StringTokenizer(data,"#");
					while(st.hasMoreElements()) {
						String id = st.nextToken();
						String name=st.nextToken();
						String phone=st.nextToken();
						String balance=st.nextToken();
						cd=new CutomerData(id,name,phone,balance);
						
						//cd.setCust_phone(phone);
						
						li.add(cd);
						
					}
					data=br.readLine();
				}
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			boolean found = false;
			ListIterator<CutomerData> c=li.listIterator();
			while(c.hasNext()) {
				CutomerData e= (CutomerData)c.next();
			
				int Cust_id=Integer.parseInt(e.getCust_Id());
				if(Cust_id== id) {
					if(menu_report =="update") {
						System.out.println("Enter the new name :- ");
						String name=my.nextLine();
						System.out.println("your old name is  ="+e.getCust_Name());
						System.out.println("your old phone number is  ="+e.getCust_phone());
						System.out.println("your new  name is  ="+name);
						System.out.println("your new phone number is  ="+amount_num);
						String id=e.getCust_Id();
						String phone= String.valueOf(amount_num);
						String balance=e.getCust_balace();
						c.set(new CutomerData(id,name,phone,balance));	
						fw=new FileWriter("Bank_Data.txt");
						br=new BufferedReader(new InputStreamReader(System.in));
						
						fw.close();
						found=true;	
					}
				}
				
				
			}
			if(!found) {
				System.out.println("Record not found");
			}
			else {
				System.out.println("Record is updated successfully" );
				for (CutomerData c1:li) {
					//System.out.println(c1.getCust_Id()+""+c1.getCust_Name()+""+c1.getCust_phone()+""+c1.getCust_balace());
					fw=new FileWriter("Bank_Data.txt",true);
					br=new BufferedReader(new InputStreamReader(System.in));
					fw.write(c1.getCust_Id());
					fw.write("#");
					fw.write(c1.getCust_Name());
					fw.write("#");
					fw.write(c1.getCust_phone());
					fw.write("#");
					fw.write(c1.getCust_balace());
					fw.write("\n");
					fw.close();
					
				}}
	}
	void with_dep() throws IOException {
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		List<CutomerData> li= new ArrayList<CutomerData>();
		CutomerData cd;
		String data;
		FileWriter fw=null;
			try {
				fr= new FileReader("Bank_Data.txt");
				br= new BufferedReader(fr);
				
				data =br.readLine();
				while(data!=null) {
					st=new StringTokenizer(data,"#");
					while(st.hasMoreElements()) {
						String id = st.nextToken();
						String name=st.nextToken();
						String phone=st.nextToken();
						String balance=st.nextToken();
						cd=new CutomerData(id,name,phone,balance);
						
					//	cd.setCust_balace(balance);
						li.add(cd);
						
					}
					data=br.readLine();
				}
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			boolean found = false;
			ListIterator<CutomerData> c=li.listIterator();
			while(c.hasNext()) {
				CutomerData e= (CutomerData)c.next();
			
				int Cust_id=Integer.parseInt(e.getCust_Id());
				if(Cust_id== id) {
					if(menu_report =="deposit") {
						System.out.println("your current balance is  ="+e.getCust_balace());
						int bal=Integer.parseInt(e.getCust_balace());
						long current_bal= bal+amount_num;
						String covert= String.valueOf(current_bal);
						String id=e.getCust_Id();
						String name=e.getCust_Name();
						String phone=e.getCust_phone();
						System.out.println("After Deposit "+amount_num+ " your current is = "+covert);
						c.set(new CutomerData(id,name,phone,covert));	
						
						
						fw=new FileWriter("Bank_Data.txt");
						br=new BufferedReader(new InputStreamReader(System.in));
						fw.flush();
						fw.close();
						found=true;	
					}
						else {
							System.out.println("your current balance is  ="+e.getCust_balace());
							int bal=Integer.parseInt(e.getCust_balace());
							long current_bal= bal-amount_num;
							
							//System.out.println("After Deposit "+amount_num+ " your current is = "+current_bal);
							String covert= String.valueOf(current_bal);
							
							String id=e.getCust_Id();
							String name=e.getCust_Name();
							String phone=e.getCust_phone();
							//cd.setCust_balace(covert);
							System.out.println("After withdraw "+amount_num+ " your current is = "+covert);
							c.set(new CutomerData(id,name,phone,covert));	
							fw=new FileWriter("Bank_Data.txt");
							br=new BufferedReader(new InputStreamReader(System.in));
							fw.flush();
							fw.close();
							found=true;
						}
					
						
						}
				}
			if(!found) {
				System.out.println("Record not found");
			}
			else {
				System.out.println("Record is updated successfully" );
				for (CutomerData c1:li) {
					//System.out.println(c1.getCust_Id()+""+c1.getCust_Name()+""+c1.getCust_phone()+""+c1.getCust_balace());
					fw=new FileWriter("Bank_Data.txt",true);
					br=new BufferedReader(new InputStreamReader(System.in));
					fw.write(c1.getCust_Id());
					fw.write("#");
					fw.write(c1.getCust_Name());
					fw.write("#");
					fw.write(c1.getCust_phone());
					fw.write("#");
					fw.write(c1.getCust_balace());
					fw.write("\n");
					fw.close();
					
				}
				
			}
			}
			
	}
	
