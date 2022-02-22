package training.main.dayfive.datenumbercurrencyapi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocateDateEx {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tommorow=date.plusDays(1);
		System.out.println(yesterday);
		System.out.println(tommorow);
		
		System.out.println(LocalDate.now().isLeapYear());
		LocalDate dateToCheckLeapYear=LocalDate.of(2016, 1, 31);
		System.out.println(dateToCheckLeapYear.isLeapYear());
		
		LocalDate dateTime=LocalDate.of(2021, 10, 15);
		System.out.println(dateTime);
		LocalDateTime dateWIthTime=dateTime.atTime(1,50,9);
		System.out.println(dateWIthTime);
		
		LocalDate currentDate=LocalDate.now();
		String strDate=currentDate.format(DateTimeFormatter.ISO_DATE);;
		System.out.println("Current Date in String Format : "+strDate);
	
		LocalDate cdate=LocalDate.of(2022,07,12);
		System.out.println("cDate in String : "+cdate.format(DateTimeFormatter.ISO_DATE));
		
		//convert String into LocalDate
		String dateStr="2022-02-09";
		LocalDate d1=LocalDate.parse(dateStr);
		System.out.println(d1);
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getMonthValue());
		System.out.println(d1.getMonth());
		
		LocalDate d2=LocalDate.now();
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		String formattedDate=d2.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
		System.out.println(formattedDate);
	}

}
