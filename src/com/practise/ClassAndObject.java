package com.practise;

public class ClassAndObject {

	public static void main(String[] args) {
		Pen p=new Pen();
		p.changeColor("Blue");
		p.changeTip(5);
		System.out.println(p.color);
		System.out.println(p.tip);
	}
}
	class Pen{
		//data members
		String color;
		int tip;
		
		//member functions
		void changeColor(String newColor)
		{
			color=newColor;
		}
		void changeTip(int newTip)
		{
			tip=newTip;
		}
	}

