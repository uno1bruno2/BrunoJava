package main;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		list = list.stream().map(x -> x * x).collect(Collectors.toList());
		list = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		int n = list.stream().reduce(Math::max).get();
		
		System.out.println(n);
		
		
	}

	
	
	
}
