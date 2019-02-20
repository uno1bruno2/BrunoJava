package main;

import java.util.ArrayList;

public class Multiply10 {

	public void multiply10(ArrayList<Integer> arraylist) {
		
		ArrayList<Integer> blankarraylist = new ArrayList<>();
		
		for (int i = 0; i < arraylist.length; i++) {
			blankarraylist.add(i) = arraylist.get(i) * 10;
		}
		
		System.out.println(blankarraylist);
		
	}
	
}
