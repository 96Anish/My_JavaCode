import java.util.Scanner;
public class j11 
{
    public static void main(String args[])
    {
        String nm;
        double Total,avg,m1,m2,m3;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Students  ");
        nm=obj.nextLine();
        System.out.println("Enter the first subject marks   ");
        m1=obj.nextInt();
        System.out.println("Enter the Second subject marks   "); 
        m2=obj.nextInt();
        System.out.println("Enter the third subject marks   ");
        m3=obj.nextInt();
        Total=m1+m2+m3;
        avg=Total/3;
        System.out.println("Students name is        :   "+(nm));
        System.out.println("Total Subject marks  : "+(Total));
        System.out.println("Avarage maarks :  "+(avg));
    }
}
    