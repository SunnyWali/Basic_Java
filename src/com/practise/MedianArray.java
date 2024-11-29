package com.practise;

import java.util.*;

public class MedianArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=(int)findMedian(arr);
		System.out.println("The median of the array is: "+result);
		
		
}
	public static double findMedian(int[] arr)
	{
		if(arr.length%2!=0)
		{
			int result=arr.length/2;
			return arr[result];
		}
		else
		{
			int idx=arr.length/2;
			double result=(double)(arr[idx]+arr[idx-1])/2;
			return result;
		}
	}
}