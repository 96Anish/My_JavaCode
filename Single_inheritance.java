class Single_inheritance 
{
    void show()
    {
        int Roll_num=12;
    
        String nm="Anish kumar";
        System.out.println("Student Roll_no = "+(Roll_num));
        System.out.println("Students name = "+nm);
    }
    void display()
    {
        System.out.println("Anish kumar");
    }
    
}
class Single_inheritance2 extends  Single_inheritance 
{
    public static void main(String args[])
    {
          Single_inheritance obj = new  Single_inheritance();
          Single_inheritance obj1 = new  Single_inheritance();
         obj.show();
         obj1.display();
    }
}
