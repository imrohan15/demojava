package training.main.dayfive.Serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	private Integer empId;
	private String Name;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + "]";
	}
}
