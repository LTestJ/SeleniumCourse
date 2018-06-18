package javaBasics;

public class Operators {

	public static void main(String[] args) {
		//1. Assignment operator =
		int userID = 78; //takes the value from right side and assigns to the left
		
		//2. Arithmetic operators + - * / %
		int a=7, b=3;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		
		//3. increment/decrement operators ++ --
		a++; //a= a+1
		b--; //b= b-1
		
//		System.out.println(a);
//		System.out.println(b);
		
		//4. Equality and relational operators
		//== equal to 
		//!= not equal to 
		//<
		//<=
		//>
		//>=
		
		a=10;
		b=20;
//		System.out.println(a==b);
//		System.out.println(a>b);		
//		System.out.println(a!=b);
//		System.out.println(a<b);
		
		//5. Conditional operators
		//&& conditional AND;
		//|| conditional OR;
		
		int c=100;		
		if (c>a || c<b) {
			System.out.println("C is greater than a and b");
		}		
	}

}
