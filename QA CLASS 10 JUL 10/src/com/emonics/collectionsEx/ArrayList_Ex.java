package com.emonics.collectionsEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		
		List<String> stud= new ArrayList<String>();
		
		stud.add("Mark");
		stud.add("Henry");
		stud.add("Lee");
		stud.add("Dustin");
		stud.add("Ray");
		stud.add("Bob");
		stud.add("James");
		stud.add("Henry");
		stud.add("Lee");
		stud.add(2, "Jack");
		stud.remove(5);
		
		
	//	System.out.println(stud.size());
		
		//System.out.println(stud.get(8));
		
		for(int i=0;i<9;i++) 
		{
			System.out.println(stud.get(i));
			
		}
		
		

	}

}
