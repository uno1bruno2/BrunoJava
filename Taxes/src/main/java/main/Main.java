package main;

public class Main {

	
	public void percentage(int n) {
		
		int ntax = 0;	
		
		if (n > 0 && n < 15000) {
			ntax = 0;
		} else if (n > 14999 && n < 20000) {
			ntax = n * 0.1;
		} else if (n > 19999 && n < 30000) {
			ntax = n * 0.15;
		} else if (n > 29999 && n < 45000) {
			ntax = n * 0.2;
		} else {
			ntax = n * 0.25;
		}
		
		
		
		
		
		
	}
	
	
}
