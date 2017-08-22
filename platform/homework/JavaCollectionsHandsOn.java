package Day5package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollectionsHandsOn {

	public static void main(String[] args) {

		int N = 150;

	int y = retrieveEvenNumber(N, 20) ;
	
	if(y<0) { System.out.println("Number not Found"); }
	
	else {  System.out.println(y)  ;} 

	}

	public static ArrayList<Integer> storeEvenNumbers(int N) {

		ArrayList<Integer> A1 = new ArrayList(N);

		for (int x = 2; x <= N; x = x + 1) {
			if (x % 2 == 0)
				A1.add(x);
		}

		return A1;

	}

	public static ArrayList<Integer> printEvenNumbers(int N) {

		ArrayList<Integer> A1 = storeEvenNumbers(N);

		ArrayList<Integer> A2 = new ArrayList(N);

		Iterator<Integer> it = A1.iterator();

		while (it.hasNext() ) {
			int temp = it.next().intValue() * 2;
		
			A2.add(temp);

		//	System.out.println(temp);
		}

		
		
		
		return A2;
	}

	public static int retrieveEvenNumber(int N, int x) {

		ArrayList<Integer> A1 = printEvenNumbers(N);

		int y = Collections.binarySearch(A1, 5);

		//System.out.println(y);

		for(int it : A1) 
		{
			System.out.println(it);
		}
		
		if(y>=0) {
			return A1.get(y); 
		}
		
		
		return -1;

	}

}
