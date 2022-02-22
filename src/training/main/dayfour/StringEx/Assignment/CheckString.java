package training.main.dayfour.StringEx.Assignment;

import java.util.Scanner;

public class CheckString {
	public static void main(String[] args) {
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your String : ");
		str=sc.next();
		//System.out.println("Entered String : "+str);
		if(str.matches("[a-zA-Z]+")) {
			System.out.println("It Contain String Only");
		}else if(str.matches("[0-9]+")) {
			System.out.println("It Contain Digit only");
		}else if(str.matches("^[a-zA-Z0-9]*$")){
			System.out.println("It Contain String as well as Digit");
		}else {
			System.out.println("Invalid String");
		}
	}
}