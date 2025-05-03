public class T_F_Multiples 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 50; i++)
        {
            // if (i % 3 == 0 && i % 5 == 0) {
            //     System.out.print(" ");
            // } else {
            //     System.out.print(i + "\n");
            // }
            if (i % 3 == 0) {
                    System.out.print(i+"T ");
                } else if (i % 5 == 0) {
                     System.out.print(i+"F ");
            //      } else {
            //    System.out.print(i + "\n");
            // }
        }
    }
}}
