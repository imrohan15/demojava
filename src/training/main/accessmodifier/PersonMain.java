package training.main.accessmodifier;

public class PersonMain {

	public static void main(String[] args) {
		Person person=new Person();
		person.address="Delhi";
		person.age=21;
		person.mobileNo=555;
		
		System.out.println(person.age);
		
		person.setFirstName("Rohan");
		person.setLastName("Sehgal");
		person.Display();
		
	}

}
