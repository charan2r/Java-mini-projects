package L1_WD;

public class Manager extends Employee {
    public Manager(int employeeNo, String employeeName, double basicSalary) {
        super(employeeNo, employeeName, basicSalary);
    }

    @Override
    public double calBonus() {
        return 0.2 * getBasicSalary(); // 20% bonus for managers
    }

    public double calTax() {
        return 0.15 * getBasicSalary(); // 15% tax for managers
    }

    @Override
    public double calGrossSalary() {
        return getBasicSalary() + calBonus() - calTax();
    }
}