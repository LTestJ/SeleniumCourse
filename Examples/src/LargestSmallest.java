
public class LargestSmallest {

	public static void main(String[] args) {
		double[] numbers={5,55,-452,-43,1,2,3,44,5,6,699,10,-18};
		double[] ret = maxMin(numbers);
		System.out.println("Max= " + ret[0]);
		System.out.println("Min= " + ret[1]);
	}
	
	static double[] maxMin(double[] numbers){		
		double max = numbers[0];
		double min = numbers[0];
	
		for(int i=0; i<numbers.length; i++){
			if (numbers[i] > max) {
				max = numbers[i];
			}			
			if (numbers[i] < min){
			 	min = numbers[i];
			}					
		}
		 	
		double[] ret = {max, min};
		return ret;
	}
}
