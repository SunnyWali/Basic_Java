	package Abstraction;
	
	public class AbstractClass {
	
		public static void main(String[] args) {
			Mustang m=new Mustang();
			
			
		}
	
	}
	abstract class Animal{
		String color;
		Animal(){
			color="blue";
			System.out.println("Animal constructor is called");
		}
		void eat() {
			System.out.println("eating");
		}
		abstract void walk();
	}
	
	class Horse extends Animal{
		Horse()
		{
			System.out.println("Horse constructor is called");
		}
		void changeColor() {
			 color="Red";
		}
		void walk() {
			System.out.println("walks in the 4 legs");
		}
	}
	
	class Mustang extends Horse{
		Mustang(){
			System.out.println("Mustang constructor is called");
		}
	}
