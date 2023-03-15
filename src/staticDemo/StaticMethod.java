package staticDemo;

import java.util.Scanner;

public class StaticMethod {
	
	 static int a = 100;    //instance variable  
	
	public static  void display()    //static method 
	{
		System.out.println("Hello guys...");
		System.out.println(a);
	}
	
	public static  void display(int a , int b)    //static method 
	{
		System.out.println("Hello guys...");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	
		display();
		//System.out.println(StaticMethod.a);
		
		Scanner sc = new Scanner(System.in);
		
	}

}
