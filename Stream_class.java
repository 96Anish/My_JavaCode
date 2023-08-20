import java.io.*;
public class Stream_class 
{
    public static void main(String args[])throws IOException
    {
        DataInputStream obj= new DataInputStream(System.in);
        System.out.print("Enter your Name = ");
        String str=obj.readLine();
        System.out.println("Your Name is = "+str);
    }
    
}
