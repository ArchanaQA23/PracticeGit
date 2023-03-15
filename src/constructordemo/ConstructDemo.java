package constructordemo;

public class ConstructDemo extends Demo{
	
	int a ;                    //variable declaration       
	
	public ConstructDemo()           // Default constructor 
	{
		this(67,90);          
		a=10;                     //variable initialization 
		System.out.println("This is my default constructor ");
		
	}
	
	//this( )
	public ConstructDemo(int a, int b)
	{
		this("Welcome","Java");
		System.out.println(a+b);
	}
	
	public ConstructDemo(int a, int b,double c)
	{
		super();
		System.out.println(a+b+c);
	}
	
	public ConstructDemo(String a, String b )
	{ 
		this(89,90,90.0);
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		
		ConstructDemo c =new ConstructDemo();       //obj creation 
//		ConstructDemo c1= new ConstructDemo(12,90); 
//		ConstructDemo c2= new ConstructDemo(78,90,6.9);
//		ConstructDemo c3= new ConstructDemo("Welcome","Guys");
		
	
	}

}
