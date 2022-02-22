package training.main.exception;

public class UserDefineExpDemo {

	public static void main(String[] args) {
		int age=8;
		try {
			if(age<18) {
				throw new AgeException(age);
			}
		} catch (AgeException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
