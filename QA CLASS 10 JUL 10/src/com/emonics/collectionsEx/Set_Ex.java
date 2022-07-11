package com.emonics.collectionsEx;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<String>();
		
		colors.add("blue");
		colors.add("white");
		colors.add("red");
		colors.add("black");
		colors.add("green");
		colors.add("brown");
		colors.add("pink");
		colors.add("white");
		colors.add("black");
		colors.add("Red");
		colors.add("Black");
		
		//System.out.println(colors.size());
		
		Iterator<String> pointer = colors.iterator();
		
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());// returns true if there value after the pointer
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		System.out.println(pointer.next());
		System.out.println(pointer.hasNext());
		
		
	
		
		
		
		
		
		
        
		

	}

}
