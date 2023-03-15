package polymorphism;

public class Son extends Father {
	
	public void audiCar()
	{
		System.out.println("This is son's audi car.. ");
	}
	
	public void fortunerCar()
	{
		System.out.println("This is son's fortuner car ");
	}
	
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.audiCar();       //own 
		s.goldWatch();     //father 
		s.fortunerCar();    // son 
		
		
		System.out.println();
		Father f = new Father();
		f.goldWatch();   //father 
		f.fortunerCar();   // father 
		
		Father f1 = new Son();    //upcasting 
		f1.goldWatch();    //father 
		f1.fortunerCar();   //son  Overrriden method of child class can also be used by parent class .
		//f1.audiCar();       // Invalid , Parent class reference cannot use child class own properties 
		
		//Son s1=new Father();   Invalid 
		
	}
	

}
