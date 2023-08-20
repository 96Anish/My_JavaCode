import java.util.Scanner;
public class fabonacci_series {
   public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      int num1=0,num2=1,sum;
      System.out.println("\t\tFabonacci Series   ");
      System.out.print("\t Enter the first Number  = ");
      num1=obj.nextInt();
      System.out.print("\t Enter the Second Number  = ");
      num2=obj.nextInt();
      for(sum=1;sum<=100;)
      {
         sum=num1+num2;
         if(sum>100)
         {
            break;
         }
         System.out.println("\t\tFabonacci Series  = "+sum);
         num1=num2;
         num2=sum;
      }


      
   } 
}
