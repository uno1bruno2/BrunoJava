package main;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		List<String> personname = new ArrayList<String>();

		Person bruno = new Person("Bruno" , 22 , "Technology Consultant");
		Person otto = new Person("Otto" , 20 , "University Student");
		Person igor = new Person("Igor" , 18 , "Studying A-Levels");
		
		people.add(bruno);
		people.add(otto);
		people.add(igor);
		
//		

//		personname = people.stream().map(x -> x.getName()).collect(Collectors.toList());
//		
//		System.out.println(personname);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String enteredName = sc.nextLine();
		
		

		people = people.stream().filter(x -> x.getName().equals(enteredName)).collect(Collectors.toList());

		for(Person i : people) {
			System.out.println(i.formattedInfo());
		}
	}

}
