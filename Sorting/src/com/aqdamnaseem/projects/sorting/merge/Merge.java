package com.aqdamnaseem.projects.sorting.merge;

/**
 * Merge sort is a recursive algorithm to sort elements
 * 
 * Steps :  
 *     			 				merge_sort(list of elements)
 *                  		 				|
 *      				-------------------------------------------------------
 *      			   |                           |                           |
 * 					merge_sort(first half)     merge_sort(second half)        merge
 *                     |
 * -----------------------------------------------------------
 * |                                   |                      |
 * merge_sort(first half)     merge_sort(second half)        merge
 *
 *
 *
 * Time Complexity Calculation :
 *
 *	The merge step will do O(n) amount of work to merge two array of size n/2 because n comparisons are required to 
 *	fill the array
 *
 *   T(n) =  T(n/2) + T(n/2)  O(n)[for merging two half]
 *   T(n) = 2T(n/2) + O(n)   ----> Recurrence Relation
 *   T(1) = O(1)   ----> Base Relation
 *   
 *    
 *    Now by master theorem
 *    
 *    T(n) = aT(n/b) + f(n)     a>=1, b>=2 and c>0
 *    T(1) = C
 *    
 *    if f(n) = O(n^d) with d >=0 
 *    
 *    T(n)=   O(n^d)  if a < b^d
 *            O(n^d Log n)  if a = b^d
 *            O(n^Log a base b) if a > b^d
 *            
 *            
 *    Clearly our recurrence relation has  a=2,b=2 and d=1, or a=b^d is satisfied so T(n)=O(nLogn) is the 
 *    time complexity
 *    
 * Space Complexity : O(n)
 * 
 * Design approach : Divide and Conquer
 * Sorts in place : No
 * Stable : Yes
 */
public class Merge {

	/**
	 * @param inputArray
	 */
	public static void sort(int[] inputArray) {
		merge_sort(inputArray, 0, inputArray.length - 1);
	}

	/**
	 * @param input
	 * @param start
	 * @param end
	 */
	public static void merge_sort(int[] input, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(input, start, mid); // recursive call of first half
			merge_sort(input, mid + 1, end); // recursive call of second half
			/**
			 * Even though the name of this method is merge but majority of work
			 * is done here
			 */
			merge(input, start, mid, end); // merging both the parts
		}
	}

	public static void merge(int[] input, int start, int mid, int end) {
		int p = start; // pointer to first half starting element
		int q = mid + 1; // pointer to second half starting element(second half
							// start from mid+1)
		int[] auxArray = new int[end - start + 1];
		int k = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid) {
				auxArray[k++] = input[q++];
			} else if (q > end) {
				auxArray[k++] = input[p++];
			} else if (input[p] < input[q]) {
				// if element at p index is less than element at index q the
				// copy pth index element to auxArray and increment by one for
				// auxArray and
				// input
				auxArray[k++] = input[p++];
			} else {
				// if element at q index is less than element at index p the
				// copy qth index element to auxArray and increment by one for
				// aurArray and
				// input
				auxArray[k++] = input[q++];
			}
		}
		// copy elements back to actual array from aux array
		for (int j = 0; j < k; j++) {
			input[start++] = auxArray[j];
		}
	}

	public static void main(String[] args) {
		int[] input = new int[]{7, 5, 7, 9, 2, 10, 1, 4, 6, 3, 2};
		Merge.sort(input);
	}
}
