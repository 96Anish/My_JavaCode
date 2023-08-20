import java.util.Scanner;
public class armstrong_number {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num, x,y,z=0;
        System.out.println("Enter the number = ");
        num=obj.nextInt();
        y=num;
        while(num!=0)
        {
            x=num%10;
            z=z*x*x*x;
            num=num/10;
        }
        if(z==num)
        {
            System.out.println("Armstrong number = "+num);
        }
        else{
             System.out.println("Armstrong number = "+num);
        }
    }    
}
