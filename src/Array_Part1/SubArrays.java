package Array_Part1;

public class SubArrays {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		showSubArrays(arr);
	}
	
	public static void showSubArrays(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
