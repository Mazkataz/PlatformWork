package com.account.example;

class Checkings {

	private float balance;

	Checkings() {
		balance = 0f; 
	}

	public void deposit(float depo) {

		this.balance+=depo; 
		
	}

	public void withdraw(float with) {

		this.balance-=with; 
	}

	float getBalance() {
		return balance;
	}

}