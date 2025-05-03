import java.util.Scanner;
class InvalidEmployeeDataException extends Exception {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }
}
class Employee {
    private int empId;
    private String name;
    private String designation;
    private int deptId;
    public Employee(int empId, String name, String designation, int deptId) throws InvalidEmployeeDataException {
        if (!name.matches("[A-Z]+")) {
            throw new InvalidEmployeeDataException("Invalid Name! Name should be in uppercase and contain only alphabets.");
        }
        if (!designation.equals("Manager") && !designation.equals("Clerk") && !designation.equals("Peon")) {
            throw new InvalidEmployeeDataException("Invalid Designation! Designation should be 'Manager', 'Clerk', or 'Peon'.");
        }
        if (deptId < 1 || deptId > 5) {
            throw new InvalidEmployeeDataException("Invalid Department ID! It should be between 1 and 5.");
        }
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.deptId = deptId;
    }
    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department ID: " + deptId);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name (Uppercase Alphabets Only): ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Designation (Manager/Clerk/Peon): ");
            String designation = sc.nextLine();
            System.out.print("Enter Department ID (Between 1 and 5): ");
            int deptId = sc.nextInt();
            Employee emp = new Employee(empId, name, designation, deptId);
            emp.display();
        } catch (InvalidEmployeeDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();  
        }
    }
}
