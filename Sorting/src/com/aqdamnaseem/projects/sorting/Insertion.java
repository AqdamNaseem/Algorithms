package com.aqdamnaseem.projects.sorting.selection;

/**
 * Insertion Sort
 * 
 * 
 * For randomly ordered arrays of length N with with distinct elements, insertion sort uses ~N^2/4 
 * compares and ~N^2/4 exchanges on the average. The worst case is ~ N^2/2 compares and ~ N^2/2 
 * exchanges and the best case is N-1 compares and 0 exchanges.
 * 
 * 1. The insertion sort, unlike the other sorts, passes through the array only
 * once.
 * 
 * 2. The insertion sort splits an array into two sub-arrays, First sub-array on
 * left side is always sorted and increases in size as the sort continues.
 * Second sub-array is unsorted, contains all the elements yet to be inserted
 * into the first sub-array, and decreases in size as the sort continues.
 * 
 * 3. Insertion sort is efficient for (quite) small data sets.
 * 
 * 4. It is more efficient than selection sort or bubble sort.
 * 
 * 5. Insertion sort is very efficient for arrays which is nearly(almost) sorted
 * and it sorts nearly sorted array in time complexity of O(N). (For sorting an
 * array containing elements in descending order to ascending order, insertion
 * sort will give poor performance and complexity will be O(N^2))
 * 
 * 6. It is Stable sort; i.e., does not change the relative order of elements
 * with equal keys.
 * 
 * 7. It is In-place sort; i.e., only requires a constant amount O(1) of
 * additional memory space
 * 
 * 8. It can sort elements as it receives it and no need of complete data
 * initially before start sorting. (Online).
 *
 * 
 */
public class Insertion {

	/**
	 * Sorts provided array elements
	 * 
	 * @param input
	 * 
	 */
	public static void sort(int[] input) {
		int len = input.length;
		for (int i = 0; i < len; i++) {
			int j = i;

			while (j > 0 && isLess(input[j], input[j - 1])) {
				swap(input, j, j - 1);
				j--;
			}

			/**
			 * for (int k = i; k > 0 && isLess(input[k], input[k - 1]); k--) {
			 * swap(input, k, k - 1); }
			 */

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
		Insertion.sort(inputArray);
		System.out.println("After Sorting  : " + getAsString(inputArray));
	}

}
