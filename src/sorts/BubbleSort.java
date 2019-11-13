package sorts;

public class BubbleSort {
	public static int[] sort(int[] array) {
		int temp;
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length - i; j++) {
				if(array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] tweakedSort(int[] array) {
		int temp;
		boolean swap;
		for(int i = 0; i < array.length; i++) {
			swap = false;
			for(int j = 1; j < array.length - i; j++) {
				if(array[j - 1] > array[j]) {
					swap = true;
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
			if(!swap) {
				return array;
			}
		}
		return array;
	}
}
