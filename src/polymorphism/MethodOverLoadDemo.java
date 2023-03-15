package polymorphism;

public class MethodOverLoadDemo {
	
	public void add  ()
	{
		int a=10,b=90;
		System.out.println(a+b);
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a, int b ,int c )
	{
		return a+b+c;
	}
	
	public double add(int a, double b )
	{
		return a+b;
	}
	
	public double add(double b, int a  )
	{
		return a +b;
	}
	
	public static void main(String[] args) {
		
		MethodOverLoadDemo m = new MethodOverLoadDemo();
		m.add();
		System.out.println(m.add(34, 89));
		int add = m.add(12,78,90);
		System.out.println(add);
		
		double add2 = m.add(12,89.7);
		System.out.println(add2);
		
		double add3 = m.add(67.9,19);
		System.out.println(add3);
		
	}
	

}
