package com.account.example;

public class Individual extends Account{
	
	Individual(String AHolder){
		super(AHolder, "Individuals");
	}

	
	public static void main(String[] args) {
		Account ac = new Individual("Bairon"); 
	
		
		System.out.println(ac.getCheckingsBalance() );
		System.out.println(ac.getSavingsBalance() );
	}
	
	
	
}