package sorts;

public class SelectionSort {
	public static int[] sort(int[] array) {
		int largestElemIndex = 0;
		int temp;
		for(int endIndex = array.length - 1; endIndex > 0; endIndex--) {
			for(int i = 0; i <= endIndex; i++) {
				if(array[i] > array[largestElemIndex]) {
					largestElemIndex = i;
				}
			}
			temp = array[endIndex];
			array[endIndex] = array[largestElemIndex];
			array[largestElemIndex] = temp;
		
		}
		
		return array;
	}
	
	public static int[] tweakedSort(int[] array) {
		int largestElemIndex = 0;
		int temp;
		for(int endIndex = array.length - 1; endIndex > 0; endIndex--) {
			for(int i = 0; i <= endIndex; i++) {
				if(array[i] > array[largestElemIndex]) {
					largestElemIndex = i;
				}
			}
			if(endIndex != largestElemIndex) {
				temp = array[endIndex];
				array[endIndex] = array[largestElemIndex];
				array[largestElemIndex] = temp;
			}
		}
		
		return array;
	}
}
