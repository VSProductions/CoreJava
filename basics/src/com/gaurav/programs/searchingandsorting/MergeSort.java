package com.gaurav.programs.searchingandsorting;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

	/** Merge-sort contents of array S. */
	public static void mergeSort(Integer[] S, Comparator<Integer> comp) {
		int n = S.length;
		if (n < 2)
			return; // array is trivially sorted
		// divide
		int mid = n / 2;
		Integer[] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
		Integer[] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
		
		// conquer (with recursion)
		mergeSort(S1, comp); // sort copy of first half
		mergeSort(S2, comp); // sort copy of second half
		
		System.out.print("S1 : " );
		printArray(S1);
		System.out.print("S2 : " );
		
		// merge results
		merge(S1, S2, S, comp); // merge sorted halves back into original
	}

	/** Merge contents of arrays S1 and S2 into properly sized array S. */
	public static void merge(Integer[] S1, Integer[] S2, Integer[] S, Comparator<Integer> comp) {

		printArray(S2);
		int i = 0, j = 0;
		while (i + j < S.length) {
			if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
				S[i + j] = S1[i++]; // copy ith element of S1 and increment i
			else
				S[i + j] = S2[j++]; // copy jth element of S2 and increment j
		}
	}

	public static void main(String args[]) {
		Integer arr[] = { 6, 2, 4, 1, 3, 5 };

		System.out.println("Initial array");
		MergeSort.printArray(arr);

		Comparator<Integer> comp = new Comparator<Integer>() {
			public int compare(Integer d1, Integer d2) {
				return d1.compareTo(d2);
			}
		};

		MergeSort.mergeSort(arr, comp);
		System.out.println("Sorted array");
		MergeSort.printArray(arr);

	}

	private static void printArray(Integer[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}