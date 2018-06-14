
public class LargestSmallest {

	public static void main(String[] args) {
		 double[] numbers={55,-452,-43,1,2,3,44,5,6,699,10,-18};
		 double max = numbers[0];
		 double min = numbers[0];
		 
		 for(int i=0; i<numbers.length; i++){
			 if (numbers[i] > max) {
				 max = numbers[i];
			 	}
			 else if (numbers[i] < min){
				 min = numbers[i];
			 	}
		 	 	}
		 
		//double[] result = {max, min};
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
