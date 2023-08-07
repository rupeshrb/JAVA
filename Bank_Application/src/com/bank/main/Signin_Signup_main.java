package com.bank.main;
import java.util.Scanner;

import com.bank.signin.Sign_in;
import com.bank.signup.Sign_up;
public class Signin_Signup_main {
	int choice;
	public Signin_Signup_main(){
		//default constract
	}
	Signin_Signup_main(int choice){
		this.choice=choice;
	}
	public void display_main() {
		Scanner my=new Scanner(System.in);
		do {
			System.out.println("\t****** WELCOME TO RB GROUP BANK ******\n");
			System.out.println("1. SIGN UP");
			System.out.println("2. SIGN IN");
			System.out.println("3. EXIT");
			choice=my.nextInt();	
		switch (choice){
		case 1:
			Sign_up sign_up;
			sign_up = new Sign_up();
			sign_up.Display_bank_signup();
			break;
		case 2:
			Sign_in sign_in = new Sign_in();
			sign_in.display();
			break;
		case 3:
			System.out.println("***********************************");
            
			break;
		default:
			System.out.println("YOU INTER WRONG CHOICE");
			break;
	}}    while(choice!=3);
	       System.out.println("Thank You");	
}
}