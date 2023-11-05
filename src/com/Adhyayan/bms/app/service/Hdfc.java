package com.Adhyayan.bms.app.service;

import java.util.Scanner;

import com.Adhyayan.bms.app.model.Account;

public class Hdfc implements Rbi {
	Account a=new Account();
	Scanner sc=new Scanner(System.in);
	
	
	public void createAccount()
	{
		System.out.println("Enter the account number");
		a.setAccNo(sc.nextInt());
		System.out.println("Enter the Account holder name");
		a.setName(sc.next());
		System.out.println("Enter mobile number");
		a.setMobNo(sc.nextLong());
		System.out.println("Enter adhaar number");
		a.setAdhaar(sc.nextLong());
		System.out.println("Enter gender : male/female/other");
		a.setGender(sc.next());
		System.out.println("Enter your age");
		a.setAge(sc.nextInt());
		System.out.println("Enter the balance");
		a.setBalance(sc.nextDouble());
		System.out.println("Account created successfully");
		System.out.println("--------------------------------------------");
		
	}@Override
	public void displayAllDetails()
	{
		System.out.println("Account number :"+a.getAccNo());
		System.out.println("Name :"+a.getName());
		System.out.println("Mobile number :"+a.getMobNo());
		System.out.println("Adhaar number :"+a.getAdhaar());
		System.out.println("Gender :"+a.getGender());
		System.out.println("age :"+a.getAge());
		System.out.println("Account Balance :"+a.getBalance());
		System.out.println("----------------------------------------------------");
		
	}
	public void depositMoney()
	{
		System.out.println("Enter amount you want to deposit");
		double amt=sc.nextDouble();
		double oldAmt=a.getBalance();
		
		a.setBalance(amt+oldAmt);
		System.out.println("amount successfully deposited");
		
	}
	public void withdrawal()
	{
		System.out.println("Enter ammount you want to withdraw");
		double amt=sc.nextDouble();
		double oldAmt=a.getBalance();
		a.setBalance(oldAmt-amt);
		System.out.println("ammount withdrawn successfully");
		
	}
	public void balanceCheck()
	{
		System.out.println("Account balance :"+a.getBalance());
		
	}
	public void acctDelete()
	{
		//System.out.println("Enter the account number");
		a.setAccNo(0);
		//System.out.println("Enter the Account holder name");
		a.setName(null);
		//System.out.println("Enter mobile number");
		a.setMobNo(0);
		//System.out.println("Enter adhaar number");
		a.setAdhaar(0);
		//System.out.println("Enter gender : male/female/other");
		a.setGender(null);
		//System.out.println("Enter your age");
		a.setAge(0);
		//System.out.println("Enter the balance");
		a.setBalance(0.0);
		System.out.println("account deleted successfully");
	}

}
