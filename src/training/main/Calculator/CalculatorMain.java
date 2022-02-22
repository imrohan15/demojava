package training.main.Calculator;
import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		int num1,num2,result;
		char op;
		System.out.println("Choose an operator : + , - , * ");
		Scanner sc=new Scanner(System.in);
		op=sc.next().charAt(0);
		
		System.out.println("Enter first number : ");
		num1=sc.nextInt();
		
		System.out.println("Enter Second number : ");
		num2=sc.nextInt();
		
		switch(op) {
		case '+' :
			Addition add=new Addition(num1,num2);
			add.Result();
		
		case '-' :
			Subtraction sub=new Subtraction(num1,num2);
			sub.Result();
		}
		
	}
}
