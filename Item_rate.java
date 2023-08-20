import java.util.Scanner;
public class j12 {
    public static void main(String args[])
    {
        String item_nm;
        double item_rate,item_quantity,total_price,final_price;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Item name  :");
        item_nm=obj.nextLine();
        System.out.println("Enter the Item Rate :");
        item_rate=obj.nextInt();
        System.out.println("Enter the Item Quantity  :");
        item_quantity=obj.nextInt();
        total_price=item_rate*item_quantity;
        final_price=total_price-total_price*(0.1); 
        System.out.println("Item name is  :"+item_nm);
        System.out.println("Final price  :"+final_price);
       


    }    
}
