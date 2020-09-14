package com.lti.basics;

public class AccountApp {

	public static void main(String[] args) {
		CreditAccount creditAcc = new CreditAccount();
		creditAcc.acno = 1234567890;
		creditAcc.name = "Majrul Ansari";
		creditAcc.balance = 50000;
		creditAcc.creditLimit = 100000;
		
		System.out.println(creditAcc.acno);
		System.out.println(creditAcc.name);
		
	}
}
