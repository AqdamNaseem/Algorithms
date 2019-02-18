package com.aqdamnaseem.projects.sorting.selection;

/**
 * Selection Sort
 * 
 * Selection sort uses N^2 compares and N exchanges to sort an array of length N
 * 
 * Algorithm steps :
 *
 * 
 * 	1. Find the minimum value in the list 
 * 	2. Swap it with the value in the current position 
 * 	3. Repeat this process for all the elements until the entire array is sorted
 * 
 * This algorithm is called selection sort since it repeatedly selects the
 * smallest element.
 * 
 * 
 * 
 * 
 * Time and Space Complexity :
 * 
 * Time Complexity : (n^2) comparisons (for all Best, Worst and Average Cases as
 * the comparison is performed always irrespective of input pattern)
 * 
 * Space Complexity : O(1)
 * 
 * 
 * Why is Selection sort faster than Bubble sort? When using Selecting sort it
 * swaps elements "n" times in worst case, but Bubble sort swaps almost n*(n-1)
 * times.
 *
 * We all know, Reading time is less than writing time even in-memory. (Compare
 * and running time can be ignored)
 * 
 * If we have a system where write operations are extremely expensive and read
 * operations are not, then Selection sort could be ideal. Selection sort is
 * good for sorting arrays of small size.
 *
 * Selection sort is better than Bubble sort due to less swapping required.
 *
 * Note: In Bubble sort, we can identify whether list is sorted or not in 1st
 * iteration but in Selection sort we can't able to identify that. Compared to
 * Selection sort, Bubble sort should be used when the given array is almost
 * sorted.
 *
 */
public class Selection {

	/**
	 * Sorts provided array elements
	 * 
	 * @param inputArray
	 * 
	 */
	public static void sort(int[] inputArray) {
		int len = inputArray.length;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = i + 1; j < len; j++) {
				if (isLess(inputArray[j], inputArray[min])) {
					min = j;
				}
			}
			swap(inputArray, i, min);
		}
	}

	/**
	 * Return True, if first element is less than second element, otherwise
	 * False
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public static boolean isLess(int first, int second) {
		System.out.println("isLess() Called");
		return first < second;
	}

	/**
	 * Swap element at index i with element at index j for the array provided
	 * 
	 * @param inputArray
	 * @param i
	 * @param j
	 */
	public static void swap(int[] inputArray, int i, int j) {
		System.out.println("swap() Called");
		int temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
	}

	/**
	 * Converts array elements to space separated values
	 * 
	 * @param inputArray
	 */
	public static String getAsString(int[] inputArray) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < inputArray.length; i++) {
			output.append(inputArray[i] + " ");
		}
		return output.toString();
	}

	public static void main(String[] args) {
		int[] inputArray = new int[]{6, 3, 9, 2, 7, 1};
		System.out.println("Before Sorting : " + getAsString(inputArray));
		Selection.sort(inputArray);
		System.out.println("After Sorting  : " + getAsString(inputArray));
	}

}
