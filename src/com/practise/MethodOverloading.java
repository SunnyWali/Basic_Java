package com.practise;

public class MethodOverloading {

	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.sum(1,2));
		System.out.println(a.sum((float)1.5,(float)2.5));
		System.out.println(a.sum(1,2,3));

	}

}

class Addition{
	int sum(int a, int b)
	{
		return a+b;
	}
	
	float sum(float a, float b)
	{
		return a+b;
	}
	
	int sum(int a, int b, int c)
	{
		return a+b+c;
	}
}
