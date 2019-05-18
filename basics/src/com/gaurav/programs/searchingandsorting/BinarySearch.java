package com.gaurav.programs.searchingandsorting;

public class BinarySearch {
	public static int binarySearchUsingRecursion(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			
			System.out.println("mid " + mid + " mid val " + arr[mid]);

			// If the element is present at the middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearchUsingRecursion(arr, l, mid - 1, x);

			// Else the element can only be present in right subarray
			return binarySearchUsingRecursion(arr, mid + 1, r, x);
		}

		return -1;
	}

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40, 50, 60, 70 };
		int x = 10;

		// Using recurrsion

		int result = BinarySearch.binarySearchUsingRecursion(arr, 0, arr.length, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index: " + result);

		// normal
		
		BinarySearch.binarySearch(arr, 0, arr.length, x);

	}
}