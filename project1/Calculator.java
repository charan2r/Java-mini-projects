import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        details();
    }

    private static void details() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter operator: ");
            String oper = input.nextLine();

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            if ("+".equals(oper)) {
                double val1 = sum(num1, num2);
                System.out.println("Answer: " + val1);
            } else if ("-".equals(oper)) {
                double val2 = subtract(num1, num2);
                System.out.println("Answer: " + val2);
            } else if ("/".equals(oper)) {
                double val3 = divide(num1, num2);
                System.out.println("Answer: " + val3);
            } else if ("*".equals(oper)) {
                double val4 = multiply(num1, num2);
                System.out.println("Answer: " + val4);
            } else {
                System.out.println("Invalid operator");
            }
        }
    }

    static double sum(double num1, double num2) {
        return num1 + num2;
    }

    static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            return Double.NaN; // Not a Number
        }
        return num1 / num2;
    }

    static double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
