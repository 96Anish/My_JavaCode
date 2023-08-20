class overloading_polymorphism
{
	void show(int a,int b)
	{
		System.out.print("Hello Anish");
	}
	void show(String s,int a)
	{
		System.out.print("Hello Anish");
	}
	void show(double f,int... b)
	{
		System.out.print("Hello Anish");
	}
	

    public static void main(String args[])
    {
	    overloading_polymorphism obj=new overloading_polymorphism();
	    obj.show(23,56);
	    obj.show(Anish,6);
	    obj.show(3.4,3,35,5,7);
    }
}

	
