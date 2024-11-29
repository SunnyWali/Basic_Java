package com.practise;

public class CopyConstructors {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.name="Sunny";
		s1.roll=123;
//		creating the copy constructor
		Student1 s2=new Student1(s1);
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println(s2.name);
		System.out.println(s2.roll);
		
		

	}

}

class Student1{
	String name;
	int roll;
	
	Student1(Student1 s1)
	{
		this.name=s1.name;
		this.roll=s1.roll;
	}
	
	Student1()
	{
		System.out.println("Non-parameterized constructors");
	}
	
//	copy constructor
	
	Student1(String name)
	{
		this.name=name;
	}
	
	Student1(int roll)
	{
		this.roll=roll;
	}
}
