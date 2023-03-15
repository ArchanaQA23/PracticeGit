package abstraction;

public class OverloadingDemo {
	//Method Overloading// compile time polymorphism
	
	int a=10;// global variable
	
	int b=20;
	
	public void calculate()
	{
		
		
		System.out.println(a+b);//10+20
	}
	
	public void calculate(int a, int b)//local variable
	{
		
		
		System.out.println(a-b);
	}
	
	public void calculate(int a, float b) {
		
		System.out.println(a/b);
	}
	
	public void calculate(float a, int b)// local variable
	{
		
		System.out.println(a*b);
	}
	
	
	
	public static void main(String[] args) {
		
		OverloadingDemo o = new OverloadingDemo();
		o.calculate();
		o.calculate(30, 50);
		o.calculate(50, 40.5f);
		o.calculate(50.3f, 30);
	}
	
	
	

}
