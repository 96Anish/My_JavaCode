import java.util.Scanner;
public class digit {
    public static void main(String args[])
    {
        int num, digit=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any number = ");
        num=obj.nextInt();
        while(num!=0)
        {
            num=num/10;
            digit++;
        }
        System.out.println("Digit of inputted number is "+digit);
    }    
}
