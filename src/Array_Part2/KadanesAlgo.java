package Array_Part2;

public class KadanesAlgo {

	public static void main(String[] args) {
		int[] arr= {4,5,6,7,8,-2};
		System.out.println("The maximum sub array is :"+findMaximum(arr));

	}
	public static int findMaximum(int[] arr)
	{
		int currSum=arr[0];
		int maxSum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			currSum=Math.max(arr[i], currSum+arr[i]);
			maxSum=Math.max(maxSum, currSum);
		} 
		return maxSum;
	}
}
