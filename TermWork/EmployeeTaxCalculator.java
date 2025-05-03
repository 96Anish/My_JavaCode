import java.util.Scanner;
class Employee {
    private String pan;
    private String name;
    private double taxIncome;
    private double tax;
    public void InputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PAN Number: ");
        pan = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Annual Taxable Income: ");
        taxIncome = sc.nextDouble();
    }
    public void TaxCalc() {
        if (taxIncome <= 250000) {
            tax = 0; // No tax
        } else if (taxIncome <= 300000) {
            tax = (taxIncome - 250000) * 0.10; 
        } else if (taxIncome <= 400000) {
            tax = 5000 + (taxIncome - 300000) * 0.20;
        } else {
            tax = 25000 + (taxIncome - 400000) * 0.30; 
        }
    }
    public void DisplayInfo() {
        System.out.println("\nEmployee Tax Details:");
        System.out.println("PAN Number: " + pan);
        System.out.println("Name: " + name);
        System.out.println("Annual Taxable Income: " + taxIncome);
        System.out.println("Calculated Tax: " + tax);
    }
}
public class EmployeeTaxCalculator {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.InputInfo();
        emp.TaxCalc();
        emp.DisplayInfo();
    }
}
 