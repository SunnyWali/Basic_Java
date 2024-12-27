package com.practise;

public class Basic {
	
    public static int minSoldiers(int[] arr, int k) {
        // code here.
        int n = arr.length;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%k==0)
            {
                c++;
            }
            
        }
        System.out.println(c);
        int x = n/2;
        
        System.out.println(x);
        if(c == x){
            return 1;
        }
        return (x-c)+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 9, 9, 8, 6, 1, 8, 4, 10, 9};
		int res = minSoldiers(arr,10);
		System.out.println(res);
//		float f = 1.5f;
//		int x = Math.round(f);
//		System.out.print(x);
	}

}
