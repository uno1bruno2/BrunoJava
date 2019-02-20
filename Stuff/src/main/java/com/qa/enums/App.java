package com.qa.enums;

public class App {
	
	public static void main(String[] args) {
		
		for(Day day : Day.values()) {
			System.out.println(day.getFeeling());
		}
		
		
	}

}
