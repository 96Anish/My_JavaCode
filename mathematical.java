public class mathematical
{
    static int num1=12;
    static int num2=13;
    static void sum()
    {
        System.out.println("Sum = "+(num1+num2));
    }
    static void sub()
    {
        System.out.println("Subtraction = "+(num1-num2));
    }
    static void multi()
    {
        System.out.println("Multiplication = "+(num1*num2));
    }
    static void div()
    {
        System.out.println("Division= "+(num1/num2));
    }
    static void mod()
    {
        System.out.print("Modulus = "+(num1%num2));
    }
    

    public static void main(String[] args) 
    {
        
        sum();
        sub();
        multi();
        div();
        mod();
    }
}