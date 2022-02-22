package training.main.dayeight.threads;

public class HelloRunnableMain {

	public static void main(String[] args) {
		HelloRunnable hr = new HelloRunnable();
		Thread th = new Thread(hr);//New Stage of State
		th.start();//Thread in runnable state where run is invoked
	}
}
