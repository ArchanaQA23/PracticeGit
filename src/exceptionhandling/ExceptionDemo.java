package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the two numbers: ");
		Scanner sc =  new Scanner(System.in);
		try
		{
			int num1 = sc.nextInt(); // 20 
			int num2 = sc.nextInt();  //0
			System.out.println(num1/num2);   // 4 
		}
		
//		catch(ArithmeticException e)
//		{
//			//System.err.println("Arithmetic exception handled ");
//			//System.err.println(e.getMessage());  / by zero
//			e.printStackTrace();
//		}
//		
//		catch(InputMismatchException e)
//		{
//			System.err.println("Input mismatch exception handled ");
//		}
		catch(Exception e)
		{
			//System.err.println("Unknown error occured ");
			System.err.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("always execute .. ");
			sc.close();
		}
		System.out.println("Program completed ...");
	}

}
