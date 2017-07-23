package com.acadgild;

public class BankMainEx {

	public static void main(String[] args) {
		
		BankExample bankEx1=new BankExample(2000);
		BankExample bankEx2=new BankExample(3000);
		bankEx1.deposit(200);
		bankEx1.withdraw(300);
		
		bankEx2.deposit(400);
		bankEx2.withdraw(300);

	}

}
