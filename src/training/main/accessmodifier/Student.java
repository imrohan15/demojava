package training.main.accessmodifier;

public class Student {
	private Integer rollNumber;
	private String studentName;
	static String collegeName="IIT";
	
	public Student(Integer rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}

	void display() {
		System.out.println("----------------------------");
		System.out.println("Roll No - "+rollNumber+"\nName - "+studentName+"\nCollege - "+collegeName);
	}
	static void changeCollegeName() {
		collegeName="LNCT Bhopal";
	}
}
