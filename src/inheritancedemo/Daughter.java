package inheritancedemo;

public class Daughter extends Father {
	
	
	public void scootyPep()
	{
		System.out.println("This is daughter's scootypep ");
	}

	
	public void ladyBird()
	{
		System.out.println("This is daughter's lady bird ");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.fortunerCar();   //own 
		s.bicycle(); //father 
		s.goldWatch();   //father 
		s.ktmBike();    //own 
		System.out.println();

		Daughter d = new Daughter();
		d.scootyPep();   //own 
		d.ladyBird();     //own 
		d.goldWatch();     //father 
		d.bicycle();       //father 
		
		
		System.out.println();
		Father f = new Father ();
		f.goldWatch(); //own 
		f.bicycle();
		System.out.println(f.wheels);
		
		
	}
}
