package sorts;

public class MergeSort {
	public static void msort(int[] arr, int[] temp, int i, int j) {
		if(i == j) return;
		
		int mid = (i + j) / 2;
		msort(arr, temp, i, mid);
		msort(arr, temp, mid + 1, j);
		
		for(int k = i; k <= j; k++) {
			temp[k] = arr[k];
		}
		
		merge(arr, temp, i, mid, j);
	}
	
	
	public static void merge(int[] arr, int[] temp, int i, int mid,  int j) {
		int t1 = i; 
		int t2 = mid + 1;
		int index = i;		
		
		while(t1 <= mid && t2 <= j) {
			if(temp[t1] < temp[t2]) {
				arr[index] = temp[t1];
				t1++;
			} else {
				arr[index] = temp[t2];
				t2++;
			}
			index++;
			
		}
		
		while(t1 <= mid) {
			arr[index] = temp[t1];
			t1++;
			index++;
		}
		
		while(t2 <= j) {
			arr[index] = temp[t2];
			t2++;
			index++;
		}
	}
	
	public static int[] sort(int[] array) {
		int[] temp = new int[array.length];
		msort(array, temp, 0, array.length - 1);
		return array;
	}
}
