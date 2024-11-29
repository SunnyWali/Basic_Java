	package com.practise;
	
	public class HybridInheritance {
	
		public static void main(String[] args) {
			Sparrow s=new Sparrow();
			Peacock p=new Peacock();
			Human h=new Human();
			Dogs d=new Dogs();
			Shark sh=new Shark();
			s.size();
			s.fly();
			p.appearance();
			p.fly();
			h.think();
			h.birth();
			d.bark();
			d.birth();
			sh.teeth();
			sh.swim();	
	
		}
	
	}
	
	class Animals{
		void breath()
		{
			System.out.println("Breaths");
		}
	}
	
	class Fishs extends Animals{
		void swim() {
			System.out.println("Swims");
		}
	}
	
	class Mammals extends Animals{
		void birth() {
			System.out.println("Give directly birth");
		}
	}
	
	class Birds extends Animals{
		void fly() {
			System.out.println("Fly");
		}
	}
	
	//objects
	class Sparrow extends Birds{
		void size()
		{
			System.out.println("They are small in size");
		}
	}
	
	class Peacock extends Birds{
		void appearance() {
			System.out.println("They are beautiful");
		}
	}
	
	class Human extends Mammals{
		void think()
		{
			System.out.println("They have the capability to think");
		}
	}
	
	class Dogs extends Mammals{
		void bark()
		{
			System.out.println("They can bark");
		}
	}
	
	class Shark extends Fishs{
		void teeth()
		{
			System.out.println("They have sharp teeth");
		}
	}
