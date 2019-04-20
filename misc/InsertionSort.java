package basics;

public class InsertionSort {
	
	public static void main(String args[]) {
		
		int list[] = {12, 11, 13, 5, 6};
		
		for (int i = 1; i < list.length; i++) {
            int j = i; 

            while (j>0 && list[j-1] > list[j]) 
            { 
            	int temp = list[j];
            	list[j] = list[j-1];
            	list[j-1] = temp;
                j = j-1; 
            } 		
		}
		
		for(int c = 0; c < list.length; c++)
			System.out.println(list[c]);
		
	}

}
