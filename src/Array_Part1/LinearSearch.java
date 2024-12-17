package Array_Part1;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		int target=18;
		int result=getIndex(arr,target);
		if(result==-1)
		{
			System.out.println("No Index Found");
		}
		else
		{
			System.out.println("The index of the targeted value is :"+result);
		}
		

	}
	
	public static int getIndex(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}

}
