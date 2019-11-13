import sorts.InsertionSort;
import sorts.BubbleSort;
import sorts.SelectionSort;
import sorts.MergeSort;
import sorts.QuickSort;


import java.util.Arrays;
import java.util.Random;

public class TestingSorts {
	public static Random gen;
	
	public static void main(String[] args) {
		gen = new Random();
		System.out.println("Insertion Sort: \t" + Arrays.toString(InsertionSort.sort(genArray(10, 100))));
		System.out.println("Bubble Sort:\t\t" + Arrays.toString(BubbleSort.sort(genArray(10, 100))));
		System.out.println("Tweaked Bubble Sort:\t" + Arrays.toString(BubbleSort.sort(genArray(10, 100))));
		System.out.println("Selection Sort:\t\t" + Arrays.toString(SelectionSort.tweakedSort(genArray(10, 100))));
		System.out.println("Tweaked Selection Sort:\t" + Arrays.toString(SelectionSort.tweakedSort(genArray(10, 100))));
		System.out.println("Merge Sort:\t\t" + Arrays.toString(MergeSort.sort(genArray(10,100))));
		System.out.println("Quick Sort:\t\t" + Arrays.toString(QuickSort.sort(genArray(10,100))));
		
	}
	
	public static int[] genArray(int size, int bound) {
		int[] newArr = new int[size];
		
		for(int i = 0; i < size; i++) {
			newArr[i] = gen.nextInt(bound);
		}
		
		return newArr;
	}
}
