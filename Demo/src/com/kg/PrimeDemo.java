package com.kg;

public class PrimeDemo { 
	static boolean isPrime(int n) { 
		if (n <= 1)  
			return false;  

		for (int i = 2; i < n; i++)  //i=2
			if (n % i == 0) 
				return false;         //false               
		return true;       } 		//true

	static void printPrime(int n)         { 
		for (int i = 2; i <= n; i++)    {  //i=2 i<=n
			if (isPrime(i)) 
				System.out.print(i + " "); 
		} 
	} 

	public static void main(String[] args) { 
		int n = 18; 
		printPrime(n); 
	} 
} 


