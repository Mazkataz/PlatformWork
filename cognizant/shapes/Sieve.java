package com.cognizant.shapes;

public class Sieve {

	public static void main(String[] args) {

		
		boolean[] sieve = new boolean[150];
		
		for(boolean a : sieve) a = false; 
		int x=2;
		
		 while(x<150)
		 {
			 int y=2; 
			 
		while(y <= x && x*y<150) 
		{
			sieve[x*y] = true; 
			y++; 
			
		}
		++x; 
		
		 }
		
		 for(int z=1; z<150; z++)
			 if(sieve[z] == false) { 
				 System.out.println(z + " is a prime ");
			 }
		
		
	}

}
