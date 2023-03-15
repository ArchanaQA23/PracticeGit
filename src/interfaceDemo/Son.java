package interfaceDemo;

public class Son implements Father, GrandFather{

	
	public void r15Bike()
	{
		System.out.println("This is son's bike ");
	}

	@Override
	public void fortunerCar() {
		System.out.println("This is son's fortuner car ..");
		
		
	}
	@Override
	public void ambassadorCar() {
		
		System.out.println("This is son's ambassador car ");
	}
	
	public static void main(String[] args) {
		Son s= new Son();
		s.r15Bike();  //own 
		s.fortunerCar(); // son 
		System.out.println(s.wheels);
		s.ambassadorCar();   //own 
		//s.wheels=89799;      We cannot change the static constant in an interface 
		
		// Father f = new Father();  // it contains abstract method , so we cannot create an object 
	
		
		
		
	}

	
	
	
}
