package com.aqdamnaseem.projects.sorting.merge;

import java.util.Comparator;

public class ElementComparator implements Comparator<Element> {

	@Override
	public int compare(Element o1, Element o2) {
		return o1.getData() - o2.getData();
	}

}
