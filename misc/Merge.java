package basics;

public class Merge {
	
	void merge(arr, left, middle, right) {
		
		int arr1Size = middle - left+1;
		int arr2Size = right - middle;
		
		int arr1[] = new int[arr1Size];
		int arr2[] = new int[arr2Size];
		
		for (int i=0; i<arr1Size; i++) 
            L[i] = arr[left + i]; 
        for (int i=0; i<arr2Size; i++) 
            R[j] = arr[middle + 1+ i]; 
	}
	

	void sort(int arr[], int left, int right) {
		
		if(left < right) {
			int middle = (left + right)/2;
			
			sort(arr, left, middle);
			sort(arr, middle+1, right);
			
			merge(arr, left, middle, right);
			
		}
	}
	public static void main(String args[]) {
		
	}
	
}
