package com.emonics.collectionsEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex1 {

	public static void main(String[] args) {
	
		Set<Integer> order = new HashSet<Integer>();
		order.add(2134);
		order.add(5123);
		order.add(7412);
		order.add(3214);
		
		System.out.println(order.size());
		
		//to fetch the values from set, assign iterator
		
		Iterator<Integer> P1= order.iterator();// assigns pointer to set colors
		
		System.out.println(P1.next());
		System.out.println(P1.hasNext());
		
		System.out.println(P1.next());
		System.out.println(P1.hasNext());
		
		System.out.println(P1.next());
		System.out.println(P1.hasNext());
		
		System.out.println(P1.next());
		System.out.println(P1.hasNext());
		
		
	}

}
