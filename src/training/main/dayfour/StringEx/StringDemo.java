package training.main.dayfour.StringEx;

public class StringDemo {
	public static void main(String[] args) {
		char[] c= {'A','B','C','D'};
		String str=new String(c);
		String s= "hello";
		if(s instanceof String) {
			System.out.println("True");
		}
		s="Hi";
		System.out.println(s);
	}
	
}
