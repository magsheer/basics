package basics;	

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String args[]) {
		
		int array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int element = scanner.nextInt();
		scanner.close();
		int result = binarySearchfn(array, element);
		
		if(result!=-1) {
			String stringToPrint = String.format("Element found at index %d", result);
			System.out.println(stringToPrint);
		}
		else
			System.out.println("Element not found");
		
	}
	
	public static int binarySearchfn(int arr[], int ele) {
		
		int start = 0;
		int end = arr.length-1;
		int mid;
		
		while(start <= end) {
			mid = (start + end)/2;
			if(arr[mid] == ele) 
				return mid;
			else if(arr[mid] < ele) 
				start = mid + 1;
			else 
				end = mid - 1;	
		}
		return -1;
	}

}
