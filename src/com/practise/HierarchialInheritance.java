	package com.practise;
	
	public class HierarchialInheritance {
	
		public static void main(String[] args) {
			Fish2 f=new Fish2();
			Dog2 d=new Dog2();
			f.breath();
			f.swim();
			d.breath();
			d.bark();
			
	
		}
	
	}
	
	class Animal2
	{
		void breath()
		{
			System.out.println("Breaths");
		}
	}
	
	class Fish2 extends Animal2{
		void swim()
		{
			System.out.println("Swims");
		}
	}
	class Dog2 extends Animal2{
		void bark()
		{
			System.out.println("Barks");
		}
	}
	