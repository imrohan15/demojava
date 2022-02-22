package training.main.abstraction;

public class PaymentMain {
	public static void main(String[] args) {
		UpiPayment upi=new UpiPayment();
		upi.recivePayment();
		upi.display();
	}
}
