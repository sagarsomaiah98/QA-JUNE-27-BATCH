package com.emonics.collectionsEx;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex {

	public static void main(String[] args) {
		
		Map<String,Integer> emp = new HashMap<String,Integer>();
		
		emp.put("Joe", 546);
		emp.put("Kane", 814);
		emp.put("Steve", 112);
		emp.put("Will", 995);
		emp.put("Kane", 324);
		System.out.println(emp);
		
		System.out.println(emp.containsKey("Will"));
		
		System.out.println(emp.get("Kane"));
		
		System.out.println(emp.containsValue(814));
		
	
		
	
	}

}
