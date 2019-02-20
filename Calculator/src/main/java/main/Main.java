package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Op oppy = new Op();
		
		int num1 = 0;
		int num2 = 0;
		String oper = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter your second number");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter your operator");
		oper = sc.nextLine();
		
		System.out.println(oppy.operation(num1 , num2 , oper));
		
		
	}
	
	

}
