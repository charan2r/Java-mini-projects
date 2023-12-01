package L1_WD;

public class Clerk extends Employee {
    private String category;

    public Clerk(int employeeNo, String employeeName, double basicSalary, String category) {
        super(employeeNo, employeeName, basicSalary);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public double calBonus() {
        if (category.equals("Grade I")) {
            return 0.1 * getBasicSalary(); // 10% bonus for Grade I clerks
        } else if (category.equals("Grade II")) {
            return 0.1 * getBasicSalary(); // 10% bonus for Grade II clerks
        } else {
            return super.calBonus();
        }
    }
}
