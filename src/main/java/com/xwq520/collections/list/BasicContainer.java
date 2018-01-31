package com.xwq520.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class BasicContainer {
	public static void main(String[] args) {
		Collection<Object> c = new HashSet<Object>();
		c.add("hello");
		c.add(new Name("f1", "l1"));
		c.add(new Integer(100));
		c.remove("hello");
		c.remove(new Integer(100));
		//作为键的时候，重写equals方法要重写hashCode方法
		System.out.println(c.remove(new Name("f1", "l1")));
		System.out.println(c);
		Name a = new Name("1", "2");
		Name b = new Name("1", "2");
		//这里没有重写hashCode方法equals还是会返回true
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
		List<Name> list = new LinkedList<Name>();
		list.add(new Name("liguo", "xia"));
		list.add(new Name("xiguo", "lia"));
		list.add(new Name("aiguo", "dia"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}

class Name implements Comparable {
	private String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return firstName.hashCode();
	}

	public int compareTo(Object o) {
		Name n = (Name) o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}

}