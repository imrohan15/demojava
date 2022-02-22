package training.main.daysix.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> balance = new Hashtable<String, Integer>();
		Enumeration names;
		String str;
		int bal;
		balance.put("Arun",505);
		balance.put("Ajay",5064);
		balance.put("Aman",7000);
		balance.put("Riya",705);
		
		names=balance.keys();
		while(names.hasMoreElements()) {
			str = (String)names.nextElement();
			System.out.println(str + " : "+balance.get(str));
		}
		
		//deposit 1000 into Riya's Acccount
		bal = balance.get("Riya");
		
	}

}
