package com.demo.interface_demo;

import java.util.Scanner;

public class Elec_Billing_Main {
	public static void main(String[] args) {
		try (Scanner my = new Scanner(System.in)) {
			System.out.println("Enter UserName =");
			String Bill_name=my.nextLine();
			System.out.println("Enter Bill ID =");
			int Bill_id=my.nextInt();
			Interface pay=new DemoesticElecBilling_Impl(Bill_id, Bill_name);
			System.out.println("Enter unit of bill =");
			int value=my.nextInt();
			System.out.println("\n payment for your bill is = "+pay.calcBilling(value));
		}
	
	}
}
