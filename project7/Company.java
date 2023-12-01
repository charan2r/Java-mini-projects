package L1_WD;

public class Company {
    public static void main(String[] args) {
        // Creating instances of employees
        Employee employee1 = new Employee(1, "John Doe", 5000);
        Manager manager1 = new Manager(2, "Jane Smith", 8000);
        Clerk clerk1 = new Clerk(3, "Alice Johnson", 4000, "Grade I");
        Clerk clerk2 = new Clerk(4, "Bob Anderson", 3500, "Grade II");

        // Calculating and displaying gross salaries
        System.out.println("Employee 1 Gross Salary: $" + employee1.calGrossSalary());
        System.out.println("Manager 1 Gross Salary: $" + manager1.calGrossSalary());
        System.out.println("Clerk 1 Gross Salary: $" + clerk1.calGrossSalary());
        System.out.println("Clerk 2 Gross Salary: $" + clerk2.calGrossSalary());
    }
}








