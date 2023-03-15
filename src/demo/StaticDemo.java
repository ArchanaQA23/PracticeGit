package demo;

public class StaticDemo {
	

int a;


	public StaticDemo()
	{
		a=10;
			}
	
	public void display()
	{
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
		System.out.println(s.a);
		
	}
	
}


