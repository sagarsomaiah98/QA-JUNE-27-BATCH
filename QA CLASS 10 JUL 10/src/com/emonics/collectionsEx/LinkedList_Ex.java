package com.emonics.collectionsEx;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Ex {

	public static void main(String[] args) {
		
		
		List<String> stud = new LinkedList<String>();
		
		stud.add("Mark");
		stud.add("Henry");
		stud.add("Lee");
		stud.add("Dustin");
		stud.add("Ray");
		stud.add("Bob");
		stud.add("James");
		stud.add("Henry");
		stud.add("Lee");
		
	System.out.println(stud.size());
		
		//System.out.println(stud.get(8));
		
		for(int i=0;i<stud.size();i++) 
		{
			System.out.println(stud.get(i));
			
		}
		

	}

}
