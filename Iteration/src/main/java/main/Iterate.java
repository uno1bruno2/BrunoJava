package main;

public class Iterate {
	
	public void exercise1() {
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	
	}
		
	public void exercise2() {
		
		for (int i = 100; i < 1000; i++) {
			System.out.println(i);
		}
	
	}
	
	public void exercise3() {
		
		String[] numWords = { "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" };
		
		for (String word : numWords) {
			System.out.println(word);
		}
	
	}
	
	public void exercise4() {

		String[] numWords1 = { "" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Eleven" , "Twelve" , "Thirteen", "Fourteen" , "Fifteen" , "Sixteen" , "Seventeen" , "Eightteen" , "Ninteen" , "Twenty" };
		String[] numWords2 = { "" , "" , "Twenty" , "Thirty" , "Fourty" , "Fifty" , "Sixty" , "Seventy" , "Eighty" , "Ninety" };
		String[] numWords3 = { "" , "Hundred" };
		String result = "";
		
		
		for (int i = 1; i < 101; i++) {
			int ifirst = i % 10;
			int itens = (i / 10) % 10;
			int ihundreds = (i / 100) % 10;
			if (i < 20) {
				result = numWords1[i];
			} else {
				String word1 = numWords1[ifirst];
				String word10 = numWords2[itens];
				String word100 = numWords3[ihundreds];
				result = word100 + word10 + word1;
				System.out.println(result);
			}
		}
		
		
	
	}
	
	public void exercise5() {

		String[] numWords1 = { "" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Eleven" , "Twelve" , "Thirteen", "Fourteen" , "Fifteen" , "Sixteen" , "Seventeen" , "Eightteen" , "Ninteen" , "Twenty" };
		String[] numWords2 = { "" , "" , "Twenty" , "Thirty" , "Fourty" , "Fifty" , "Sixty" , "Seventy" , "Eighty" , "Ninety" };
		String result = "";
		
		
		for (int i = 1; i < 1001; i++) {
			int ifirst = i % 10;
			int itens = (i / 10) % 10;
			int ihundreds = (i / 100);
			
			if (i < 20) {
				result = numWords1[i];
				System.out.println(result);
			} else if (i % 100 > 19 && i > 99) {
				String word1 = numWords1[ifirst];
				String word10 = numWords2[itens];
				String word100 = numWords1[ihundreds];
				result = word100 + "Hundred " + word10 + " " + word1;
				System.out.println(result);
			} else if (i % 100 < 20 && i > 99) {
				String word10 = numWords1[i % 100];
				String word100 = numWords1[ihundreds];
				result = word100 + "Hundred " + word10;
				System.out.println(result);
			} else if (i == 1000) {
				System.out.println("One Thousand");
			}  else {
				String word1 = numWords1[ifirst];
				String word10 = numWords2[itens];
				result = word10 + " " + word1;
				System.out.println(result);
		}
		
		
	
	}

}
}