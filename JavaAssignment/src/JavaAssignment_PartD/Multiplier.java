package JavaAssignment_PartD;

import java.util.Calendar;

public class Multiplier extends Mathematician {

	public Multiplier() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public int multiply(int x, int y) {
	
		
		this.result = this.num1 * this.num2; 
		
		
		 this.responseTime = (int) (timeRequested - Calendar.getInstance().get(Calendar.MILLISECOND));

		
		return 0;
	}



	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}



}
