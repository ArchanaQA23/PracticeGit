package demo;

public class FirstScript {
	
	int a =10;       //global variable or instance variables                     //variable declaration 
	
	public  void displayNumber(  )                   //instance method 

	{
		char c ='7';                         ///local variable 
		System.out.println("LOCAL VARIABLE:" +c);
		System.out.println("*****Displaying the number****");
		System.out.println(a);
	}
	
	public void show()
	{
		System.out.println(a);
		
	}
	
	public static void main(String args[])       
	{
		FirstScript f = new FirstScript();       //object creation or instance 
		System.out.println("Calling the method");
		f.displayNumber();                             //method call using object 
		f.show();
		System.out.println("Instance variable :" +f.a);
		
	}
	
	//calling the method 
	//displaying thr number 
	//10
	//10
	

}
