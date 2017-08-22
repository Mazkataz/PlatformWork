package com.platform.homework;

public class Shapes {

	private int numberOfSides;
	int sideLength = 0;

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	Shapes(int numSides) {

		this.numberOfSides = numSides;

	}

	public void calculateShapeArea(int sideLength) {

		
		switch(numberOfSides)
		{
		case 1 :  {
			Circle c = new Circle();
			c.calculateArea(sideLength); 
			break;
		}

		case 3 : {
			Triangle t = new Triangle();
			t.calculateArea(sideLength);
			break;

		}

		case 4: {
			Square s = new Square();
			s.calculateArea(sideLength);
			break;

		}

		default : {
			System.out.println("no Shape Present");
		}
		
		} // end of switch class

	}

	public static void main(String[] args) {

		Shapes s = new Shapes(3);
		s.calculateShapeArea(12);
	}

}
