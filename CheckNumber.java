import java.util.Scanner;
class CheckNumber 
{
     public static void main(String[] args) 
     {
        Scanner obj=new Scanner(System.in);
        
       
        System.out.print("Enter the first number = ");
        int num =obj.nextInt();
        System.out.print("Enter the first number = ");
        int num2 =obj.nextInt();
        if(num<num2)
        {
            System.out.println("Num2 is greater than num");
        }
        else if(num>num2)
        {
            System.out.println("Num is grater than num2");
        }
        else 
        {
            System.out.println("Both number are equal");
        }
    }
}
