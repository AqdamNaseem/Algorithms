package com.aqdamnaseem.projects.sorting.selection;

/**
 * Shellsort is a simple extension of insertion sort that gains speed by
 * allowing exchanges of entries that are far apart, to produce partially sorted
 * arrays that can be efficiently sorted, eventually by insertion sort. The idea
 * is to rearrange the array to give it the property that taking every hth entry
 * (starting anywhere) yields a sorted sequence. Such an array is said to be
 * h-sorted.
 * 
 * By h-sorting for some large values of h, we can move entries in the array
 * long distances and thus make it easier to h-sort for smaller values of h.
 * Using such a procedure for any increment sequence of values of h that ends in
 * 1 will produce a sorted array: that is shellsort.
 * 
 * Shell sort is a highly efficient sorting algorithm and is based on insertion
 * sort algorithm. This algorithm avoids large shifts as in case of insertion
 * sort, if the smaller value is to the far right and has to be moved to the far
 * left.
 * 
 * This algorithm uses insertion sort on a widely spread elements, first to sort
 * them and then sorts the less widely spaced elements. This spacing is termed
 * as interval. This interval is calculated based on Knuth's formula as −
 * 
 * Knuth's Formula
 * 
 * h = h * 3 + 1 where h is interval with initial value 1
 *
 */
public class Shell {

	/**
	 * Sorts provided array elements
	 * 
	 * @param inputArray
	 * 
	 */
	public static void sort(int[] input) {
		int len = input.length;

		// 3x+1 increment sequence: 1, 4, 13, 40, 121, 364, 1093, ...
		int h = 1;
		while (h < len / 3)
			h = 3 * h + 1;

		while (h >= 1) {
			// h-sort the array
			for (int i = h; i < len; i++) {
				for (int j = i; j >= h
						&& isLess(input[j], input[j - h]); j -= h) {
					swap(input, j, j - h);
				}

			}
			System.out.println("h = " + h + " : " + getAsString(input));
			h /= 3;
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
		int[] inputArray = new int[]{6, 3, 9, 2, 7, 1, 8, 5, 4, 10};
		System.out.println("Before Sorting : " + getAsString(inputArray));
		Shell.sort(inputArray);
		System.out.println("After Sorting  : " + getAsString(inputArray));

	}

}
