package com.lamba.expression.comparator.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompartorSortingList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(60);
		list.add(50);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
