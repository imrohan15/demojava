package training.main.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		int i=5;
		int result=0;
		try {
			result=i/0;
		} catch (ArithmeticException e) {
			System.out.println("Cannot Divide by Zero");
		}finally {
			System.out.println("Finally Block");
		}
		System.out.println("Result : "+result);
		System.out.println("-----------END-----------");
	}
}
