package training.main.dayeight.producerconsumer;

import java.util.Iterator;

public class Consumer extends Thread{
	
	private Factory factory;
	
	public Consumer(Factory factory) {
		this.factory = factory;
	}

	public void run() {
		for (int i = 0; i < 11; i++) {
			factory.get();
		}
		
	}

}