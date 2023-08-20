import java.util.Scanner;
public class switc_case_arithmetic_operator 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        double num1,num2;
        char operator;
        System.out.println("Enter the two number = ");
        num1=obj.nextDouble();
        num2=obj.nextDouble();
        System.out.print("Enter the Arithmetic operator = ");
        operator=obj.next().charAt(0);
        switch(operator)
        {
            case '+':
                    System.out.println("Sum of two number ="+(num1+num2));
                    break;
            case '-':
                    System.out.println("Subtraction of two number ="+(num1-num2));
                    break;
            case '*':
                    System.out.println("Multiplicatiion of two number ="+(num1*num2));
                    break;
           case '/':
                    System.out.println("Division of two number ="+(num1/num2));
                    break;
            case '%':
                    System.out.println("Modolus  of two number ="+(num1%num2));
                    break;
            

        }

    }
}
