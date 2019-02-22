package com.aqdamnaseem.projects.sorting.merge;

public class Element {

	private int data;
	private int fromArrayIndex;

	public Element(int data, int fromArrayIndex) {
		this.data = data;
		this.fromArrayIndex = fromArrayIndex;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the fromArrayIndex
	 */
	public int getFromArrayIndex() {
		return fromArrayIndex;
	}
	/**
	 * @param fromArrayIndex
	 *            the fromArrayIndex to set
	 */
	public void setFromArrayIndex(int fromArrayIndex) {
		this.fromArrayIndex = fromArrayIndex;
	}

}
