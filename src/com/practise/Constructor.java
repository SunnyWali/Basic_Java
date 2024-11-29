package com.practise;

public class Constructor {

	public static void main(String[] args) {
//		calling the non-parameterized constructors
		Student s=new Student();
//		Calling the parameterized constructor
		Student s1=new Student("Sunny");
		Student s2=new Student(123);
		System.out.println(s1.name);
		System.out.println(s2.roll);
		
	}

}

class Student{
	String name;
	int roll;
	
	
	
//	this is the non-parameterized constructor
	Student()
	{
	System.out.println("Non-parameterized constructors");
	}
	
//	this is the parameterized constructor
	Student(String name)
	{
		this.name=name;
	}
	
	Student(int roll)
	{
		this.roll=roll;
	}
	
}
