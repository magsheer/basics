package basics;

import java.util.Scanner;

public class SqaureRoot {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		scanner.close();
		
		double sqrt = findSquareRoot(number);
//		String string = String.format("Sqaureroot of %d = %lf", number, sqrt);
		System.out.println(sqrt);
		
	}
	
	public static double findSquareRoot(int number) {
		
		double start = 0;
		double end = number;
		double epsilon = Math.pow(10, -5);
		double mid = 0;
		
		while(start<=end) {
			 mid = (start + end)/2;
			
			double squared = mid*mid;
			
			if(Math.abs(squared-number) <= epsilon)
				return mid;
			else if(squared < number)
				start = mid;
			else 
				end = mid;		
	}
		return mid;

}
}
