package basics;

import java.util.Scanner;

public class Atoi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be converted to integer");
		String stringInput = scanner.nextLine();
		int integerResult = convertToInteger(stringInput);
		System.out.println("Converted to integer");
		System.out.println(integerResult);
		
	}
	
	public static int convertToInteger(String string) {
		
		int integer = 0;
		for(int i = 0; i < string.length(); i++) {
			integer = integer * 10 + string.charAt(i) - '0';
		}	
		
		return integer;	
	}
}
