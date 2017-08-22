package com.platform.handson;

public class EmployeeTax {

	public static void main(String[] args) {

		TaxCalculator testCase1 =new TaxCalculator(true, 25000); 
		
		testCase1.calculateTax();
		testCase1.deductTax();
		testCase1.validateSalary();
		
		TaxCalculator testCase2 = new TaxCalculator(true, 125000);
		testCase2.calculateTax();
		testCase2.deductTax();
		testCase2.validateSalary();
		
		

		
		
		
	}

	
	
	
}
