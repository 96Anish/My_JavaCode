import java.util.Scanner;
public class magic_number {
    public static void main(String args[])
    {
        int num,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number = ");
        num=obj.nextInt();
       
        while(num!=0)
        {
            sum=sum+(num%10);
            num=num/10;
        }
        if(sum==10)
        {
            System.out.println("Magic number ");
        }
        else{
           System.out.println(" Not Magic number "); 
        }
    }    
}
