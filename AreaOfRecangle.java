import java.util.Scanner;
public class AreaOfRecangle 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the Lenght = ");
        float length=obj.nextFloat();
        System.out.print("Enter the breadth = ");
        float beadth=obj.nextFloat();
        System.out.println("Area of Raectangle ="+(length*beadth));

    }
}
