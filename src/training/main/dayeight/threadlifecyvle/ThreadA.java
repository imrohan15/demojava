package training.main.dayeight.threadlifecyvle;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		//moving thread tA to the state timed waiting
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The state of thread tB whilke it invoked the method join() on thread tA:--"+ThreadAMain.tB.getState());
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
