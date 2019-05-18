package com.gaurav.programs.searchingandsorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 64, 25, 12, 22, 11 };
		BubbleSort.sort(arr);
		System.out.println("Sorted array");
		BubbleSort.printArray(arr);

	}

	private static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
