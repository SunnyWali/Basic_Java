package Array_Part2;

public class CheckSorted {

	public static void main(String[] args) {
		int[] arr= {1,2,3,-2,5};
		boolean result=isSorted(arr);
		if(result)
		{
			System.out.println("The array is sorted");
		}
		else
		{
			System.out.println("The array is not sorted");
		}

	}
	public static boolean isSorted(int[] arr)
	{
		if(arr==null||arr.length<=1)
		{
			return true;
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				return false;
			}
		}
		return true;
	}

}
