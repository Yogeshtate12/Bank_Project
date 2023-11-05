package com.Adhyayan.bms.app.client;

import java.util.Scanner;

import com.Adhyayan.bms.app.service.Hdfc;
import com.Adhyayan.bms.app.service.Rbi;


public class Test {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Rbi obj=new Hdfc();
		System.out.println("Welcomw to Hdfc Bank");
		while(true)
		{
		System.out.println("1.create account\n2.display account details\n3.deposit money\n4.withdraw money\n5.check balance\n6.delete account");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			obj.createAccount();
			break;
		case 2:
			obj.displayAllDetails();
			break;
		case 3:
			obj.depositMoney();
			break;
		case 4:	
			obj.withdrawal();
			break;
		case 5:
			obj.balanceCheck();
			break;
		case 6:	
			obj.acctDelete();
			break;
		default :
			System.out.println("invalid choice code");
		}
		System.out.println("----------------------------------------------------------");
	 }	
		

	}

}
