package com.platform.homework;

 class Circle {

	public int numberOfSides = 0; 
	
	
	
	public void calculateArea (int radius) {
		
		double area = Math.PI *radius*radius; 
		System.out.println("The area of the Circle is " + area);
		
	}
	
}

class Access { 

	void mm() { 
		
		Circle a = new Circle(); 
		a.calculateArea(0);
		
		
	}
	
	

}
