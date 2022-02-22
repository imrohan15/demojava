package training.main.accessmodifier;

public class DataTypeExample {

	public static void main(String[] args) {
		//decaring number variable of int datatype
		int number=0;
		//declaring and initializing num1,2 variable of int datatype
		int num1=10,num2=20;
		//declaring num variable of float datatype
		float num=0;
		//declaring and initialing pi with double data
		double pi=3.14159;
		char c='c';
		byte b=22;	
		boolean flag=false;
		
		System.out.println(number);
		System.out.println(num1+num2);
		System.out.println(num);
		System.out.println(pi);
		System.out.println(c);
		System.out.println(b);
		System.out.println(flag);
	}
	public int addition(int num11,int num22) {
		return num11+num22;
	}
}
