/*package com.cognizant.shapes;

 class Account{
	
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
	
	void transferToCheckings() { 
		
	}
	
	void transferToSavings() {
		
		
	}
	
	float getSavingsBalance() { 
		return s.getBalance(); 
	}
	
	float getCheckingsBalance() { 
		return c.getBalance(); 
	}
	
}


 class Individual extends Account{
	
	Individual(String AHolder){
		super(AHolder, "Individuals");
	}

	
	public static void main(String[] args) {
		Account acount = new Individual("Bairon"); 
		System.out.println(acount.getCheckingsBalance() );
		System.out.println(acount.getSavingsBalance() );
	}
	
	
	
}



 class Checkings {

	private float balance;

	Checkings() {
		balance = 0f; 
	}

	public void deposit(float depo) {

		balance+=depo; 
		
	}

	public void withdraw(float with) {

		balance-=with; 
	}

	float getBalance() {
		return balance;
	}

}

class Savings {
	
	private float balance ; 
	
	public void deposit() {

	}

	public void withdraw() {

	}
	
	
	float getBalance() {
		return balance;
	}
	
	
	
}
*/