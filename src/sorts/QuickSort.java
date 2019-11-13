package sorts;

import java.util.Arrays;

public class QuickSort {
	public static int[] sort(int[] array) {
		qsort(array, 0, array.length - 1);
		return array;
	}
	
	private static void qsort(int[] array, int i, int j) {
		int p = ((i+j) / 2); //choo64se pivot index
		int temp = array[p];
		array[p] = array[j];
		array[j] = temp;
		
		int k = partition(array, i, j);
		if((k-i) > 1) qsort(array, i, k-1);
		if((j-k) > 1) {
			qsort(array, k+1, j);
		}
	}
	
	private static int partition(int[] array, int i, int j) {
		int p = j;
		int temp;
		j--;
		while(i <= j) {
			while(array[i] < array[p]) {
				i++;
			}
			while((j >= i) && (array[j] >= array[p])) {
				j--;
			}
			if(j > i) {
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		temp = array[i];
		array[i] = array[p];
		array[p] = temp;
		return i; 
	}
}
