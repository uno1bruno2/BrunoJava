package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IsPrime {
	
	public void primes(int n) {
		
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
        		
		
	}
	
	
	
	
}
