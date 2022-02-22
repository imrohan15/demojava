package training.main.exception;

public class AgeException extends Exception{
	private int age;
	public AgeException(int a) {
		age=a;
	}
	
	public String toString() {
		return age +" is an inavlid age";
	}
}
