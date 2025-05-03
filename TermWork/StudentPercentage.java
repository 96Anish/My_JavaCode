import java.util.Scanner;
public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxMarks = 0;
        try {
            if (args.length > 0) {
                maxMarks = Integer.parseInt(args[0]);
            } else {
                System.out.print("Enter maximum marks: ");
                maxMarks = sc.nextInt();
            }
            System.out.print("Enter marks obtained: ");
            int obtainedMarks = sc.nextInt();
            if (obtainedMarks < 0 || obtainedMarks > maxMarks) {
                throw new IllegalArgumentException("Marks obtained cannot be negative or greater than max marks.");
            }
            double percentage = (obtainedMarks * 100.0) / maxMarks;
            System.out.println("Percentage: " + percentage + "%");   
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input! Max marks must be a valid integer.");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
        }
    }
}
