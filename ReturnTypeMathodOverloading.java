/**
 Question. Write a program for method overloading return type void,
 return type String,return type Student and return type int.
 And all cases are compulasary in this program.
*/
class ReturnTypeMathodOverloading
{
	void method()
	{
		
	}
	String method(String nm)
	{
		return"Anish";	
	}
	/*Student method()
	{
		
	}*/
	int method(int x)
	{
		return x;
	}
	public static void main(String[] args)
	{
		ReturnTypeMathodOverloading obj=new ReturnTypeMathodOverloading();
		System.out.println("Hello");
		System.out.println(""+obj.method("Anish"));
		//obj.method();
		System.out.println(""+obj.method(23));

		
	}
	
}
