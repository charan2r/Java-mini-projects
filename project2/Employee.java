package project3;

public class Employee extends Person {
    private int empId;
	
	public Employee(String name, String gender, int Id) {
		super(name,gender);
		this.setEmpId(Id);
	}
	public void dowork(String work) {
		System.out.println("Doing " +work);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}	
}
