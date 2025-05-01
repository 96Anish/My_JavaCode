import java.util.Scanner;
public class Calculator {
    public static void main(String ars[])
    {
        Scanner obj =new Scanner(System.in);
        double num,num1;int ch;
        System.out.println("================================================");
        System.out.println("Choice (1:Add 2:subtraction 3:Multiply 4:Division 5:Moduls) :");

        System.out.print("Enter your operator choice :");
        ch=obj.nextInt();
        System.out.print("Enter the two number: \n");
        num=obj.nextDouble();
        num1=obj.nextDouble();
        System.out.println("=====================Calculator=================");
        switch(ch)
        {
            case 1:
                double result=(num + num1);
                System.out.println("Sum of two number is : "+result);
                System.out.println("================================================");
                break;
            case 2:
                double result1=(num - num1);
                System.out.println("Subtraction of two number is : "+result1);
                System.out.println("================================================");
                break;
            case 3:
                double result2=(num * num1);
                System.out.println("Multiple of two number is : "+result2);
                System.out.println("================================================");
                break;
            case 4:
                if(num1!=0)
                    System.out.println("Division of two number is : "+(num/num1));
                else
                    System.out.println("When num1 is zero then not divisible");
                System.out.println("================================================");
                break;
            case 5:
                if(num1!=0)
                    System.out.println("Division of two number is : "+(num%num1));
                else
                    System.out.println("When num1 is zero then not Moduls");
                System.out.println("================================================");
                break;
            default:
                System.out.println("Invalid operators");
                break;
        }
    }
}
