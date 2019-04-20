package basics;

public class SelectionSort {
	
	public static void main(String args[]) {
		
		int list[] = {5,6,2,3,4,1};
		
		for(int i=0; i<list.length-1 ; i++) {
			int min=i;
			for(int j=i+1; j<list.length;j++) {
				if(list[min]>list[j])
					min = j;
			}
				int temp = list[min];
				list[min] = list[i];
				list[i]=temp;
		}
		
		for(int c = 0; c < list.length; c++)
			System.out.println(list[c]);

		
	}

}
