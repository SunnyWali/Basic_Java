package com.practise;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int digit=0;
		//to calculate the number of digit
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=n;
		int sum=0;
		while(temp>0)
		{
			//to calculate the last digit
			int last=temp%10;
			sum+=Math.pow(last, digit);
			temp=temp/10;	
		}
		if(sum==n)
		{
			System.out.println("The number is armstrong number");
		}
		else
			System.out.println("The number is not armstrong number");
	}
}
