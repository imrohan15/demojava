package training.main.dayfour.StringEx;

public class STringComparison {
	public static void main(String[] args) {
		//in java we can compare String on the basis of content and reference
		//by using equals() method
		//by using == operator
		//by using compareTo() method
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1==s2);//compares references
		System.out.println(s1.equals(s2));//compares values of string of equality
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}
