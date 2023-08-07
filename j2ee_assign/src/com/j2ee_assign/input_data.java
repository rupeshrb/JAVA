package com.j2ee_assign;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class input_data {
private String int_id;
private String int_name;
private String int_phone;
private String address;
@Override
public String toString() {
	return "input_data [int_id=" + int_id + ", int_name=" + int_name + ", int_phone=" + int_phone + ", address="
			+ address + "]";
}

public String getInt_id() {
	return int_id;
}

public String getInt_name() {
	return int_name;
}

public String getInt_phone() {
	return int_phone;
}

public String getAddress() {
	return address;
}

public input_data(String int_id, String int_name, String int_phone, String address) {
	super();
	this.int_id = int_id;
	this.int_name = int_name;
	this.int_phone = int_phone;
	this.address = address;
}
public input_data() {
	super();
	// TODO Auto-generated constructor stub
}



	public void display() {
		transfer_data td=new transfer_data();
		Scanner my=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\t****** WELCOME TO RB GROUP  ******\n");
			System.out.println("1. view all file data");
			System.out.println("2. view all collection data");
			System.out.println("3. view all database data");
			System.out.println("4. fill data in database");
			System.out.println("5. Exit");
			
			choice=my.nextInt();	
		switch (choice){
		case 1:
			td.write_data();
			break;
		case 2:
			
			td.show_collection_data();
			break;
		case 3:
			td.show_database();
			break;
		case 4:
			td.transfer_filedata_to_collectionObj_to_database();
			System.out.println("***********************************");
            
			break;
		case 5:
			System.out.println("***********************************");
            
			break;
		default:
			System.out.println("YOU INTER WRONG CHOICE");
			break;
	}}    while(choice!=5);
	       System.out.println("Thank You");	
	}

}
