package training.main.exception;

import java.io.FileNotFoundException;

public class ThrowDemo {
	public static void main(String[] args) {
		ThrowDemo t=new ThrowDemo();
		try {
			t.proc();
		} catch (FileNotFoundException fe) {
			System.out.println("Recaught : "+fe);
		}
	}
	void proc() throws FileNotFoundException {
		try {
			throw new FileNotFoundException("From Exception");
		}catch(FileNotFoundException e){
			System.out.println("Caugnt inside demproc");
			throw e;
		}
	}
}
