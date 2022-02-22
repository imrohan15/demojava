package training.main.dayfour.StringEx.Assignment;

import java.util.Scanner;

public class NameInitials {

	public static void main(String[] args) {
		String name="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		name=sc.nextLine();
		System.out.println("Entered Name : "+name);
		System.out.print("Name Initials : ");
		for(String nm:name.split("['\\s']")) {
			System.out.print(nm.charAt(0)+".");
		}
	}
}
