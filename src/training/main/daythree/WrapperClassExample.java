package training.main.daythree;

public class WrapperClassExample {

	public static void main(String[] args) {
		Integer a=10;
		Integer c=Integer.valueOf(11);
		System.out.println(c instanceof Integer);
		System.out.println(a instanceof Integer);
		
		Float d=12.15f;
		System.out.println(d instanceof Float);
		
	}

}
