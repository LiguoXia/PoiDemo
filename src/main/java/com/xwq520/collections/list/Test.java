package com.xwq520.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		Collection<String> c =  new LinkedList<String>();
		List<String> list =  new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("1111:" + it.next());
		}
		c.add("hello");
		c = (LinkedList)c;
		System.out.println(c.size());
	}

}
