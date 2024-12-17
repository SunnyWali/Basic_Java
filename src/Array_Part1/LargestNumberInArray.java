package Array_Part1;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] arr= {2,5,45,8,125,78,96};
		System.out.println("The maximum number in array is:"+getLargest(arr));

	}
	public static int getLargest(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

}
