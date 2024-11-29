package com.practise;

public class Inheritance {

	public static void main(String[] args) {
		Fish shark=new Fish();
		shark.color="Blue";
		System.out.println(shark.color);
		shark.eat();
		shark.sleep();
		shark.fins=2;
		System.out.println(shark.fins);
		shark.swim();
		

	}

}

class Animal{
	String color;
	
	void eat()
	{
		System.out.println("Eats");
	}
	
	void sleep()
	{
		System.out.println("sleeps");
	}
	
}

class Fish extends Animal{
	int fins;
	
	void swim()
	{
		System.out.println("Swims");
	}
}
