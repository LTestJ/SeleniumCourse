package javaBasics;

public class IfElseLadder {

	public static void main(String[] args) {
		double price = 100.00;
		
		if(price>200)  //condition1
		{
			//If condition1 is true, execute this step
			System.out.println("Apply 15% Discount");
		}
		else if(price>100)  //condition2
		{
			//If condition2 is true, execute this step
			System.out.println("Apply 10% Discount");
		}
		else if(price>50)  //condition3
		{
			//If condition3 is true, execute this step
			System.out.println("Apply 5% Discount");
		}
		else  //condition4
		{
			//If condition4 is true, execute this step
			System.out.println("Apply NO Discount");
		}		
	}
}
