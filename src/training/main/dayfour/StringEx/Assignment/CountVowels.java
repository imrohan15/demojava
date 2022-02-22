package training.main.dayfour.StringEx.Assignment;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		String str="";
		int vow=0,con=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your String : ");
		str=sc.nextLine();
		str=str.toUpperCase();
		if(str.matches("[a-zA-Z]+")) {
			for (int i = 0; i < str.length(); i++) {
				//System.out.println(str.charAt(i));
				if((str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U')){
					vow++;
				}else {
					con++;
				}
			}
		}
		else {
			System.out.println("Invalid String");
		}
		System.out.println("Number of Vowels     : "+vow);
		System.out.println("Number of Consonants : "+con);
	}
}

