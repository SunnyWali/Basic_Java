package Array_Part1;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int[] arr= {2,45,56,78,98,0,102};
		System.out.println("The minimum number in the array is:"+getSmallest(arr));
	}
	public static int getSmallest(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}
