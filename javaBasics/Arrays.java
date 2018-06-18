package javaBasics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] productTypes = {"laptop", "phone", "desktop"};
		// the above string type array has length of 3
		// cannot change its data type or its length (length= number of elements)
		//Another way to represent:
		double[] productPrices = new double[3];
		
		productPrices[0] = 199.29;
		productPrices[1] = 299.49;
		productPrices[2] = 499.89;
		
		System.out.println(productTypes[0]);
		System.out.println(productTypes[2]);
		System.out.println(productTypes[1]);
		
		System.out.println(productPrices[0]);
		System.out.println("Length: " + productPrices.length);
		
		String [][]	orderTable = new String[5][3];
		//will learn about double array later
	}

}
