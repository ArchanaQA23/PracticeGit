package inheritancedemo;

public class Son extends Father {
	
	public void fortunerCar()
	{
		System.out.println("This is son's fortuner car ");
	}

	
	public void ktmBike()
	{
		//System.out.println(super.wheels);
		super.goldWatch();
		super.bicycle();
		System.out.println("This is son's bike ");
	}
	
	
	public static void main(String[] args) {
		Son s = new Son();
		s.fortunerCar();
		s.ktmBike();
		
	}
	
	
	
}
