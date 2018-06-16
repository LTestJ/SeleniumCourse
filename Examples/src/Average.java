
public class Average {

	public static void main(String[] args) {		
		double[] numbers = {4,1,2,4,5,6,7,1};
		System.out.println("average is " +  average(numbers));
	}
	
	static double average(double[] numbers) {		
		double sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];	
		}
	
		double average = sum/numbers.length;		
		return average;
	}
}
