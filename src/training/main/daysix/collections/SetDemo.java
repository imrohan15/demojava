package training.main.daysix.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	//set will not store duplicate elements.
	//it store unique elements.
	//does not allow duplicates
	//is an unsorted,unordered set
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Hello");
		set.add(null);
		set.add("Hello");
		set.add(15);
		set.add(16.50);
		System.out.println(set);
		
		Set<String> StringSet =new HashSet<String>();
		
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpName("Akshat");
		
		Employee e1 = new Employee();
		e1.setEmpId(102);
		e1.setEmpName("Mohit");
		
		Employee e2 = new Employee();
		e2.setEmpId(101);
		e2.setEmpName("Akshat");
		
		Set<Employee> setOfEmp = new HashSet();
		setOfEmp.add(e);
		setOfEmp.add(e1);
		setOfEmp.add(e2);
		System.out.println(setOfEmp);
		
		//TreeSet - it does not allow duplicates
		//by default its element will be in ascending order - sorted collection
		//not synchronized - if more than one thread wants to access it at the same time, then it must be
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		System.out.println(treeSet);
		
	}
}
