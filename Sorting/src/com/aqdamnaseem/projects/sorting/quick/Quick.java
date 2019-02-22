package com.aqdamnaseem.projects.sorting.quick;

import static com.aqdamnaseem.projects.sorting.Util.isLess;
import static com.aqdamnaseem.projects.sorting.Util.swap;

import java.util.Arrays;

/**
 * Like Merge Sort algorithm , Quick Sort is also a recursive algorithm.Here the
 * selection of pivot element plays a important role in time complexity
 * 
 * Lets see the time complexity calculation
 * 
 * Worst-case running time :
 * 
 * Let's start by looking at the worst-case running time. Suppose that we're
 * really unlucky and the partition sizes are really unbalanced. In particular,
 * suppose that the pivot chosen by the partition function is always either the
 * smallest or the largest element in the n n-element subarray. Then one of the
 * partitions will contain no elements and the other partition will contain n-1
 * n−1 elements—all but the pivot. So the recursive calls will be on subarrays
 * of sizes 0 and n-1.
 * 
 * 
 *                n                                     cn
 *                |
 *         0--------------n-1                           c(n-1)
 *                         |
 *                 0--------------n-2                   c(n-2)
 *                                  |
 *                           0--------------n-3         c(n-3)
 *                                           |
 *                                           |
 *                                           |
 *                                           |
 *                                     0--------------2   2c
 *                                                    |
 *                                              0--------------1 c
 *                                               
 *  Work done at each level is basically arranging elements in order(done by partition method).We are basically checking
 *  no of elements at each level and putting it either left or right of pivot
 *  
 *  Total Time = c(1+2+3+4+5+--(n-2)+(n-1)+n)=n(n+1)/2 = O(n^2)
 *  
 *  
 *  Best-case running time
 *	Quicksort's best case occurs when the partitions are as evenly balanced as possible: their sizes either are equal 
 *  or are within 1 of each other. The former case occurs if the subarray has an odd number of elements and the pivot 
 *  is right in the middle after partitioning, and each partition has (n-1)/2 (n−1)/2 elements. The latter case 
 *  occurs if the subarray has an even number n n of elements and one partition has n/2 n/2 elements with the other 
 *  having n/2-1 n/2−1. In either of these cases, each partition has at most n/2 n/2 elements, and the tree of 
 *  subproblem sizes looks a lot like the tree of subproblem sizes for merge sort, with the partitioning times looking 
 *  like the merging times:
 *  
 *                                      n                                         cn
 *                                      
 *                  	n/2                            n/2                        cn
 *                                  
 *               n/4         n/4               n/4            n/4                 cn  
 *               
 *                
 *                
 *              1             1                 1               1                 cn
 *                           
 * Let us find the height of this tree.Assume after k iteration we have reached the last levelwith single element
 *     so n/2^k =1 or k =Log N so there are Log N levels and work done at each level is cn
 *     so the time complexity is O(nLogn)
 *     
 * Stable : No
 * 
 * Note : Pivot if selected as median of the elements will give the best time complexity of O(nLogn) but finding the
 * median of all elements is time consuming.There maybe a scenario that the array is already sorted and selecting the
 * first element will give time complexity of O(n^2) and selecting the middle element(which is medain of all element)
 * will give time complexity of O(nLogn)
 * 
 * So you should either select middle element or randomly any element as pivot
 * 
 * The best case time complexity calculation is same as Merge Sort using Master theorem
 * 
 * Space Complexity : O(1) though stack size of Log n(best case) to n(worst case) can be used
 */
public class Quick {

	public static void sort(int[] input) {
		quick_sort(input, 0, input.length - 1);
	}

	public static void quick_sort(int[] input, int start, int end) {
		if (start < end) {
			int pivot = partition(input, start, end); // major work done here
			quick_sort(input, start, pivot - 1); // recursively sort elements
													// before pivot
			quick_sort(input, pivot + 1, end); // recursively sort elements
												// before pivot

			// remember pivot is already at right place for example : 5 4 6 9 19
			// 14 and 9 is pivot so here pivot is at correct position and
			// elements left to it are smaller than it and ta right greater than
			// it. so they have to be sorted to get 4 5 6 9 14 19
		}
	}

	public static int partition(int[] input, int start, int end) {
		// this will arrange the elements before and after pivot but which
		// element will act as pivot.Lets make the starting element as pivot
		int pivot = input[start];
		int i = start + 1;
		for (int j = start + 1; j <= end; j++) {
			if (isLess(input[j], pivot)) {
				swap(input, i, j);
				i += 1;
			}
		}
		swap(input, start, i - 1);
		return i - 1;
	}

	public static void main(String[] args) {
		int[] input = new int[]{7, 5, 7, 9, 2, 10, 1, 4, 6, 3, 2};
		Quick.sort(input);
		Arrays.stream(input).forEach(System.out::println);
	}

}
