package com.acadgild;

public class BankExample{

	private double balance;
	
	public BankExample(double balance) {
		this.balance=balance;
	}
	
	public synchronized void deposit(int amount){
		
		balance=balance+amount;
		System.out.println("amount deposited:"+amount+" and balance is:"+balance);
	}
	
	public synchronized void withdraw(int amount){
		balance=balance-amount;
		System.out.println("amount withdrawn:"+amount+" and balance is:"+balance);
	}
	
}
