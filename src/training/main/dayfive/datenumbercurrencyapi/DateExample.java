package training.main.dayfive.datenumbercurrencyapi;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println("First Date is : "+date1);
		
		Date date2=new Date(99999999999L);
		System.out.println("First Date is : "+date2);
		
		Date date3=new Date(999999999999L);
		System.out.println("Third Date is : "+date3);
		
		if(date1.after(date2)) {
			System.out.println("First Date is After Second Date");
		}
		
		if(date2.before(date3)) {
			System.out.println("Second Date is Before third Date");
		}
	}

}
