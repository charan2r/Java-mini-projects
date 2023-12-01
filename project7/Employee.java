package L1_WD;

public class Employee {
    private int employeeNo;
    private String employeeName;
    private double basicSalary;

    public Employee(int employeeNo, String employeeName, double basicSalary) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calBonus() {
        return 0.05 * basicSalary; // 5% bonus for other employees
    }

    public double calGrossSalary() {
        return basicSalary + calBonus();
    }
}