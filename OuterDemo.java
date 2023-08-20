class OuterDemo 
{
     private int a = 40;
     private int b =50;
      void display()
       {
         int c = 60;
          class LocalDemo 
          { 
            void method() 
            {
                 System.out.println("a + b + c = "+(a+b+c));
            }
        } 
        LocalDemo l = new LocalDemo(); 
        l.method();


       } 
 public static void main(String args[]) 
 {
     OuterDemo obj=new OuterDemo();
      obj.display(); 
    } 
}
