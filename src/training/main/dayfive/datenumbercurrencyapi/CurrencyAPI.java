package training.main.dayfive.datenumbercurrencyapi;

import java.util.Currency;
import java.util.Locale;

public class CurrencyAPI {

	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		System.out.println(locale);
		System.out.println(Locale.getAvailableLocales());
		Currency c=Currency.getInstance(locale);
		System.out.println(c.getCurrencyCode());
		System.out.println(c.getSymbol());
		System.out.println(c.getDisplayName());
		
		Currency c1=Currency.getInstance(locale.US);
		System.out.println(c1.getCurrencyCode());
		System.out.println(c1.getSymbol());
		System.out.println(c1.getDisplayName());
	}
}
