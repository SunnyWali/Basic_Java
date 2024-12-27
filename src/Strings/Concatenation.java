package Strings;
import java.util.*;
public class Concatenation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String firstName;
		String LastName;
		System.out.println("Enter the first name of the person");
		firstName=sc.nextLine();
		System.out.println("Enter the last name of the person");
		LastName=sc.nextLine();
		System.out.println("The full name of the person is: "+firstName+" "+LastName);
	}
}
