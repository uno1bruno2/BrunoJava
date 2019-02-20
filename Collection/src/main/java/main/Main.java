package main;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		int[] collection = new int[100];
		
		for (int i = 0; i < 100; i++) {
			collection[i] = i + 1;
		}
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		for (int i = 100; i < 1000 ; i++) {
			arraylist.add(i);
		}
		
	}

}
