package com.aqdamnaseem.projects.sorting.merge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MWayMerge {

	private PriorityQueue<Element> queue;

	public MWayMerge() {
		queue = new PriorityQueue<>(50, new ElementComparator());
	}

	/**
	 * Merging is a process of combining two sorted list into a single sorted
	 * list
	 * 
	 * 
	 * A simple solution is to create an output array of size n*k and one by one
	 * copy all arrays to it. Finally, sort the output array using any O(n Log
	 * n) sorting algorithm. This approach takes O(nk Log nk) time.
	 * 
	 * One efficient solution is to first merge arrays into groups of 2. After
	 * first merging, we have k/2 arrays. We again merge arrays in groups, now
	 * we have k/4 arrays. We keep doing it unit we have one array left. The
	 * time complexity of this solution would O(nk Log k). How? Every merging in
	 * first iteration would take 2n time (merging two arrays of size n). Since
	 * there are total k/2 merging, total time in first iteration would be
	 * O(nk). Next iteration would also take O(nk). There will be total O(Log k)
	 * iterations, hence time complexity is O(nk Log k)
	 * 
	 * 
	 * Another efficient solution is to use Min Heap. This Min Heap based
	 * solution has same time complexity which is O(nk Log k). But for different
	 * sized arrays, this solution works much better.
	 * 
	 * Following is detailed algorithm. 1. Create an output array of size n*k.
	 * 2. Create a min heap of size k and insert 1st element in all the arrays
	 * into the heap 3. Repeat following steps n*k times. a) Get minimum element
	 * from heap (minimum is always at root) and store it in output array. b)
	 * Replace heap root with next element from the array from which the element
	 * is extracted. If the array doesn’t have any more elements, then replace
	 * root with infinite. After replacing the root, heapify the tree.
	 * 
	 * 
	 * A Binary Heap is a Binary Tree with following properties. 1) It’s a
	 * complete tree (All levels are completely filled except possibly the last
	 * level and the last level has all keys as left as possible). This property
	 * of Binary Heap makes them suitable to be stored in an array.
	 * 
	 * 2) A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap,
	 * the key at root must be minimum among all keys present in Binary Heap.
	 * The same property must be recursively true for all nodes in Binary Tree.
	 * Max Binary Heap is similar to MinHeap.
	 * 
	 * 
	 * In Java we can make use of Priority Heap
	 * 
	 * @param arrays
	 * @param n
	 *            no of elements in each array
	 * @param k
	 *            no of arrays
	 * @return
	 */
	public int[] mway_merge(int[][] arrays, int n, int k) {
		int[] output = new int[n * k];
		int[] index = new int[arrays.length];
		makeHeap(arrays, k, index);
		int p = 0;
		while (!queue.isEmpty()) {
			Element node = queue.remove();
			int listIndex = node.getFromArrayIndex();
			output[p] = node.getData();
			p++;
			if (index[listIndex] < arrays[listIndex].length) {
				queue.add(new Element(arrays[listIndex][index[listIndex]],
						listIndex));
				index[listIndex] = ++index[listIndex];
			}
		}
		return output;
	}

	/**
	 * @param arrays
	 * @param k
	 * @param index
	 */
	private void makeHeap(int[][] arrays, int k, int[] index) {
		for (int i = 0; i < k; i++) {
			queue.add(new Element(arrays[i][0], i));
			index[i] = ++index[i];

		}
	}

	public static void main(String[] args) {
		int[][] input = new int[3][3];
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				input[i][j] = k++;
			}
		}
		MWayMerge merge = new MWayMerge();
		int[] output = merge.mway_merge(input, 3, 3);
		Arrays.stream(output).forEach(System.out::println);
	}

}
