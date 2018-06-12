
public class ArraySum {

	public static void main(String[] args) {
		 int[] numbers={1,2,4,5,7,8};
		 System.out.println(Sum(numbers));
	}
	
	//prototype of function
	static int Sum(int[] numbers){
		
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
		}
		return sum;
	}
}
