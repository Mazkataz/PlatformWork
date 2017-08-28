package JavaAssignment_PartD;

import java.util.Calendar;

public class Subtractor extends Mathematician {

	Subtractor(int num_1, int num_2) {
		this.num1 = num_1;
		this.num2 = num_2;

		 timeRequested = Calendar.getInstance().get(Calendar.MILLISECOND);
	}

	Subtractor(int num_1, int num_2, int num_3) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
		 this.responseTime = (int) (timeRequested - Calendar.getInstance().get(Calendar.MILLISECOND));
	}

	@Override
	public int add(int x, int y) {

		this.result = this.num1 - this.num2; 
		
		
		return 0;
	}
	
	public int add() {

		this.result = this.num1 - this.num2 - this.num3; 
		
		
		return 0;
	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
