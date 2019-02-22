package com.aqdamnaseem.projects.sorting;

public class Util {

	/**
	 * @param first
	 * @param second
	 * @return
	 */
	public static boolean isLess(int first, int second) {
		return first < second;
	}

	/**
	 * @param input
	 * @param first
	 * @param second
	 */
	public static void swap(int[] input, int first, int second) {
		int temp = input[first];
		input[first] = input[second];
		input[second] = temp;
	}

}
