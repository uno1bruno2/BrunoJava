package main;

public class IsMessageQA {
	
	public boolean checkstring(String message) {
		boolean check = true;
		if(message != "QA Consulting")
			check = false;
		return check;
	}
	
}
