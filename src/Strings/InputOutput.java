package Strings;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter the name of the person");
		name=sc.nextLine();
		System.out.println("The name of the person is:"+name);
		System.out.println("The length of the string is:"+name.length());
	}

}
