package com.qa.hashmap;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> ascii = new HashMap<Integer,String>();

		ascii.put(97, "a");
		ascii.put(98, "b");
		
		System.out.println(ascii.get(98));
		
		
	}

}
