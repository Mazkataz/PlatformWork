package JavaAssignment_PartB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMethods {

	public static void main(String[] args) throws IOException {

		// Create two variables to store the horizontal and vertical positions
		// specified origin  is (0,0)
		int h = 0;
		int v = 0;

		InputStreamReader file = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(file);

		//string will be the iterable container 
		String directions = br.readLine();

		//check upper limit
		if(directions.length()>10)
			System.out.println("I won't be able to make it that far");
		
		else{
		for (int i = 0; i < directions.length(); i++) {

			//Iterate through each character and increment/decrement horizontal/vertical values
			switch (directions.charAt(i)) {

			case 'U':
				v++;
				break;
			case 'R':
				h++;
				break;
			case 'L':
				v--;
				break;
			case 'D':
				h--;
				break;
			default:
				System.out.println(directions.charAt(i) + " was ignored ");
			}

		}
		System.out.println(h + " " + v);
	}
	  } //end of else statement
}