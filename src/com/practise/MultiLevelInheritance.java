package com.practise;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eyes=2;
		d.breathe();
		d.birth();
		d.bark();
		System.out.println(d.eyes);
		

	}

}

class Animal1{
	int eyes;
	
	void breathe()
	{
		System.out.println("breath");
	}
	
}

class Mammal extends Animal1{
	void birth()
	{
		System.out.println("Give births");
	}
}

class Dog extends Mammal{
	void bark()
	{
		System.out.println("barks");
	}
}