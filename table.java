import java.util.Scanner;
public class table {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int num,t=1;
        System.out.print("Enter the number  = ");
        num=obj.nextInt();
        while(t<=10)
        {
            System.out.println(num+"*"+t+"="+num*t);
           // num++;
        }
         t++;
    }    
}
