package main;

public class Operator {
	public int operation(int num1 , int num2 , String operator) {
		
		switch(operator) {
			case "+":
				System.out.println("The sum of these two numbers is");
				return num1 + num2;
			case "-":
				System.out.println("The difference of these two numbers is");
				return num1 - num2;
			case "*":
				System.out.println("The multiplication of these two numbers is");
				return num1 * num2;
			case "/":
				System.out.println("The division of these two numbers is");
				return num1 / num2;
			default:
				System.out.println("Invalid operator");
				return Integer.MAX_VALUE;
				
		}
		
	}
	
	
	
	
	
	
}
