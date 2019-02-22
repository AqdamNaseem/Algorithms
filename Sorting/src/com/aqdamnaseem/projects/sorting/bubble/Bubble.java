package com.aqdamnaseem.projects.sorting.bubble;

import static com.aqdamnaseem.projects.sorting.Util.isLess;
import static com.aqdamnaseem.projects.sorting.Util.swap;

import java.util.Arrays;

public class Bubble {

	/**
	 * 
	 * This sorting algoritm, repeatedly compares pair of adjacents elements and
	 * swap them if they appear in wrong order. In every pass, the largest
	 * element of that iteration is moved to the end.
	 * 
	 * Time Complexity : 
	 * 
	 * Worst case :   O(n^2) when the array is reverse sorted
	 * Best case  :   O(n) when the array is already sorted
	 * Average case : O(n^2)
	 * 
	 * Note : When the array is already sorted, then there wont be any swaps happening in the first pass 
	 * itself, which will result in swapped boolean varaible to retain value as false and breaking the outer loop.
	 * This result in outer loop executed 2 times and inner loop executed  n[practically n+1] times + n comparisons 
	 * or total 2+2n times or O(n)
	 * 
	 * Space Complexity : O(1) this is auxiliary space required apart from O(n) which anyway 
	 * the problem requires for storing the array
	 * 
	 * 
	 * Design approach : Incremental
	 * Sorts in place : Yes
	 * Stable : Yes
	 * 
	 * 
	 */
	public static void sort(int[] input) {
		int len = input.length; // 1 unit of time
		boolean swapped=true;
		/**
		 * (n + 1) unit of time , note that here we are only concerned about the
		 * comparison(i < len-1) part though total time taken is 1[int i=0]+
		 * n+1[i<len-1]+n[i++]=2n+2
		 */
		for (int i = 0; i < len - 1 && swapped; i++) {
			swapped = false;
			/**
			 * now everything inside this loop will be executed n times, since
			 * the inner loop execution depends on outer loop variable, we have
			 * to trace down the execution time with i and j
			 * 
			 * 
			 * Lets trace out the execution
			 * 
			 * 
			 * | i   | j   | no of execution times |
			 * -------------------------------------
			 * | 0   | n   | n 						|
			 * | 1   | n-1 | n-1 					|
			 * | 2   | n-2 | n-2 					|
			 * | 3   | n-3 | n-3 					|
			 * | n-1 | 1   | 1  					|
			 * | n   | 0   | 0 						|
			 * 
			 * 
			 * so the total no of execution = 1+2+3+4+-----(n-2)+(n-1)+n = O(n^2)
			 * 
			 */
			for (int j = 0; j < len - i - 1; j++) {
				if (isLess(input[j + 1], input[j])) {
					swap(input, j, j + 1);
					swapped = true;

				}
			}
		}
	}

	
	public static void main(String[] args) {
		int[] input = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Bubble.sort(input);
		Arrays.stream(input).forEach(System.out::println);
	}

}
