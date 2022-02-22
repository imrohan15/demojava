package training.main.daysix.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Double> hm = new TreeMap<String, Double>();
		hm.put("Alex", 3512.50);
		hm.put("Jhon", 1050.0);
		hm.put("Rico", 500.50);
		hm.put("Dylan", 905.50);
		//hm.put(null, 265.50);
		//hm.put(null, null);
		hm.put("Jerry", null);
		hm.put("Dylan", 908.50);
		System.out.println(hm);
		
		Set set = hm.entrySet(); // get a set of the entries in the map
		System.out.println(set);
		System.out.println(hm.keySet());
		
		System.out.println(hm.get("Rico"));
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>)itr.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
	}

}
