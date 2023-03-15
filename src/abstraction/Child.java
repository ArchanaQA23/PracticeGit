package abstraction;

public class Child extends Parent{

	@Override
	public void goldWatch() {
		System.out.println("This is child's gold watch");
	}
	
	public void schoolBag()
	{
		System.out.println("This is child's school bag ");
	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.schoolBag();
		c.goldWatch();
		c.goldJewels();   
		
		
		//Parent p = new Parent(); // we cannot instatntiate an object 
	}
	

}
