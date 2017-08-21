package com.account.example;



public class Account{
	
	String accountHolder, type ;
	static long CUSTOMERID = 100; 
	long id; 
	static String Bank = "CTBank"; 
	
	Savings s = new Savings(); 
	Checkings c = new Checkings(); 
	
	Account(String acHolder, String m_type) { 
		accountHolder = acHolder; 
		id = ++CUSTOMERID;
		type = m_type;
		
	}
	
	void transferToCheckings(float amt) { 
		
		this.s.withdraw(amt);
		this.c.deposit(amt);
		
	}
	
	void transferToSavings(float amt) {
		this.c.withdraw(amt);
		this.s.deposit(amt);
		
	}
	
	float getSavingsBalance() { 
		return s.getBalance(); 
	}
	
	float getCheckingsBalance() { 
		return c.getBalance(); 
	}
	
	void depositToChecking(float amt) {
		
	}
		void depositToSavings(float amt) {
		
	}
	
	
}








