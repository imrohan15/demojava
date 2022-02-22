package training.main.daysix.collections;

import java.util.TreeSet;

public class StudentComparableDemo {

	public static void main(String[] args) {
		TreeSet treeStudent = new TreeSet();
		treeStudent.add(new Student(11,"Aman",90.50));
		treeStudent.add(new Student(12,"Ajay",70.50));
		treeStudent.add(new Student(13,"Raman",75.60));
	
		System.out.println(treeStudent);
	}

}
