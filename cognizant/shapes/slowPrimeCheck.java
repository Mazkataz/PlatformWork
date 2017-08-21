package com.cognizant.shapes;

public class slowPrimeCheck {

	public static void main(String[] args) {

		int x = 3;


		while (x < 150) {
			boolean flag = true;

			
			for (int y = 2; y <= (int)Math.sqrt(x); y++) {
				if (x % y == 0) {
					flag = false;
					break;

				}
			}

			if (flag) {
				System.out.println(x + " is prime");
			}
			++x;

		}

	}

}
