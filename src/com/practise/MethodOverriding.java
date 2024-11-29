package com.practise;

public class MethodOverriding {

	public static void main(String[] args) {
		Doges d=new Doges();
		d.eat();

	}

}

class Animales{
	void eat() {
		System.out.println("eats");
	}
}

class Doges extends Animals{
	void eat()
	{
		System.out.println("eats meats");
	}
}
