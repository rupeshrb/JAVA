package com.bank.signup;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Sign_up {

	private String cut_name;
	private String cut_mob;
	private String cut_dep;
	public Sign_up(){
		//create default constructor 
	}
	Sign_up(String cut_name,String cut_mob,String cut_dep){
		this.cut_name=cut_name;
		this.cut_mob=cut_mob;
		this.cut_dep=cut_dep;
	}
	
	
	int Random_num() {
		FileReader fr_u;
		FileWriter fw_u=null;
		BufferedReader br_u;
		StringTokenizer st_u;
		int id_F=0;
		int value=0;
		try {
			fr_u=new FileReader("stud_data.txt");
			br_u=new BufferedReader(fr_u);
			int i=0;
			String  data=br_u.readLine();
			while(data != null) {
				 st_u=new StringTokenizer(data);
				 while(st_u.hasMoreElements()) {
					 String id=st_u.nextToken();
					 id_F=Integer.parseInt(id);
					 id_F =id_F+1;			 
				 }
				 data=br_u.readLine();
		}try {
			fw_u=new FileWriter("stud_data.txt",true);
			br_u=new BufferedReader(new InputStreamReader(System.in));
		
			String ref_id_unique = String.valueOf(id_F);
			fw_u.write(ref_id_unique);
			fw_u.write("\n");	
		    value=Integer.parseInt(ref_id_unique);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
 				fw_u.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
			catch(Exception e){
				e.printStackTrace();
			}
		return value;
	}
	
	
	public void Display_bank_signup() {
		int ref_id;
		int exit = -1;
		FileWriter fw=null;
		BufferedReader br;
		do {
		try {
		System.out.println("\t******Signup******");
		
		fw=new FileWriter("Bank_Data.txt",true);
		br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter USERNAME := ");
		cut_name=br.readLine();
		System.out.println("Enter MOBILE NUMBER := ");
		cut_mob=br.readLine();
		System.out.println("Enter DEBIT AMOUNT := ");
		cut_dep=br.readLine();
		ref_id=Random_num();
		System.out.println("Your ID for reference  is (AUTO-GENERATED) := "+ref_id);
		String ref_id_unique = String.valueOf(ref_id);

		fw.write(ref_id_unique);
		fw.write("#");
		fw.write(cut_name);
		fw.write("#");
		fw.write(cut_mob);
		fw.write("#");
		fw.write(cut_dep);
		fw.write("\n");	  
		System.out.println("IF you want to EXIT press 0 ,else to retry press 1 =");
		Scanner my=new Scanner(System.in);
		exit=my.nextInt();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("\n \n\t**** Your Data has been Recorded ****");
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}while(exit != 0);
	}}
