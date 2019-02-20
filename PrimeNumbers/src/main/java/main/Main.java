package main;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many primes are there less than ...");
		int n = Integer.parseInt(sc.nextLine());
		
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
//		for (int factor = 2; factor*factor <= n; factor++) {
//			if (isPrime[factor]) {
//				for (int j = factor; factor*j <= n; j++) {
//					isPrime[factor*j] = false;
//				}
//			}
//		}
        
        for(int p = 2; p*p <=n; p++) { 
        	if(isPrime[p]) {
				for(int i = p*2; i <= n; i += p) {
					isPrime[i] = false;
				}
			} 
        } 
        
        List<Integer> list = new ArrayList<Integer>();
        
        
        ArrayList<Integer> primenumbers = new ArrayList<Integer>();
        int primes = 0;
        for (int i = 2; i <= n; i++) {
        	if (isPrime[i]) {
        		primes++;
//        		primenumbers.add(i);
//        		System.out.println(primenumbers[primes]);
        		System.out.println(i);
			}
		}
        
//		System.out.println(primenumbers);
        

        
        
        System.out.println("The number of primes <= " + n + " is " + primes);
	}

}
