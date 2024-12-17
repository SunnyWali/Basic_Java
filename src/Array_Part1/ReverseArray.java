package Array_Part1;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		int[] result=getReverse(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}

	}
	
	public static int[] getReverse(int[] arr)
	{
		int start=0,end=arr.length-1;
		for(int i=start;i<end;i++)
		{
			if(start!=end)
			{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			}
			else
			{
				break;
			}
		}
		return arr;
	}
}
