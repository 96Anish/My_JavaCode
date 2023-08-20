import java.util.Scanner;
public class j35 {
    public static void main(String args[])
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number = ");
        num=obj.nextInt();
        while(num<=100)
        {
            if(num%2==0)
            System.out.println("All even number 1 to 100  = "+num);
            else
            {
             System.out.println("All even number 1 to 100  = "+num);
            }
            num++;
            
        }
        
    }    
}
