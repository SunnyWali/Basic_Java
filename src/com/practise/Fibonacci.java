package com.practise;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements to be printed");
	int n=sc.nextInt();
	System.out.println("enter the first elements");
	int num1=sc.nextInt();
	System.out.println("enter the second elements");
	int num2=sc.nextInt();
	System.out.println(num1);
	System.out.println(num2);
	for(int i=2;i<n;i++)
	{
		int num3=num1+num2;
		System.out.println(num3);
		num1=num2;
		num2=num3;
	}
	}
}
