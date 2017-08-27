package JavaAssignment_PartD;

import java.util.Calendar;

public class Adder extends Mathematician {

	Adder(int num_1, int num_2) {
		this.num1 = num_1;
		this.num2 = num_2;

		// timeRequested = Calendar.getInstance().get(Calendar.MILLISECOND);
	}

	Adder(int num_1, int num_2, int num_3) {
		this.num1 = num_1;
		this.num2 = num_2;
		this.num3 = num_3;
		// timeRequested = Calendar.getInstance().get(Calendar.MILLISECOND);
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
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
