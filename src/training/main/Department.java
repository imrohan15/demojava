package training.main;

public class Department {
	private Integer deptid;
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	private String deptName;
	public Department() {
		
	}
	public Department(Integer deptNo,String deptNm) {
		this.deptid=deptNo;
		this.deptName=deptNm;
	}
}
