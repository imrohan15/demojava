package training.main.accessmodifier;

public class StudentMain {

	public static void main(String[] args) {
		Student st1=new Student(1,"Aditya");
		Student st2=new Student(2,"Nikhil");
		Student st3=new Student(3,"Riya");
		st1.display();
		st2.display();
		st3.display();

		Student.collegeName="IIT INDORE";
		st1.display();
		st2.display();
		st3.display();
		
		st1.collegeName="IIT MUMBAI";
		st1.display();
		st2.display();
		st3.display();
		
		System.out.println("changing valie of static variable using static method");
		Student.changeCollegeName();
		st1.display();
		st2.display();
		st3.display();
		
	}

}
