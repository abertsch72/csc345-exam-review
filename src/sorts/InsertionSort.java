package sorts;

public class InsertionSort {
	public static int[] sort(int [] array) {
		int temp;
		int j;
		for(int i = 1; i < array.length; i++) {
			j = i;
			while(j > 0 && (array[j] < array[j - 1])) {
				temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
				j--;
			}
		}
		
		return array;
	}
}
