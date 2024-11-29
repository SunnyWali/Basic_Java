package com.practise;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		boolean result=isPrime(n);
		if(result)
		{
			System.out.println("The number is prime number");
		}
		else
			System.out.println("The number is not prime number");
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else {
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
}

