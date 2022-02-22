package training.main.dayeight.threads;

public class ThreadExample extends Thread{

	public void run(){
		System.out.println("---Hello---");
	}
	
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		te.start();
	}

}
