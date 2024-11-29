package com.practise;
import java.util.Scanner;
public class MeanArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter "+" "+n+" "+"elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=findMean(arr);
		System.out.println("The mean of the array is: "+result);
	}
	
	public static int findMean(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum/arr.length;
		
	}

}
