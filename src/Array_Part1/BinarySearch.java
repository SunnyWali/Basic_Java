package Array_Part1;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7,8,10};
		int key=7;
		int result=getData(arr,key);
		if(result==-1)
		{
			System.out.println("No key in the Array");
		}
		else
		{
			System.out.println("the index of the array is: "+result);
		}

	}

	public static int getData(int[] arr,int key)
	{
		int start=0,end=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]>key)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		return -1;
	}
}
