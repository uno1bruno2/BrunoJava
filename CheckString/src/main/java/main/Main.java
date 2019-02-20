package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String message = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		message = sc.nextLine();

		if (message.equals("QA Consulting")) {
			System.out.println("Your message is a match");
		} else {
			System.out.println("Your message is not a match");
		}
		sc.close();

	}

}
