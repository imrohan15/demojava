package training.main;

public class DepartmentMain {

	public static void main(String[] args) {
		Department dt=new Department();
		dt.setDeptid(14);
		dt.setDeptName("Marketing");
		
		Department dtUsingParameter=new Department(15,"Finance");
		System.out.println(dt.getDeptid());
		System.out.println(dt.getDeptName());
		
		dtUsingParameter.setDeptid(15);
		dtUsingParameter.setDeptName("Finace ");
		System.out.println(dtUsingParameter.getDeptid());
		System.out.println(dtUsingParameter.getDeptName());
	}
}

