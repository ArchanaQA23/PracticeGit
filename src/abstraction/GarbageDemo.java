package abstraction;

public class GarbageDemo {
	
	protected void finalize() throws Throwable
	{
		System.out.println("Finalize method called ..");
	}
	
	public static void main(String[] args) {
		
		GarbageDemo g = new GarbageDemo();
		int hashCode = g.hashCode();
		System.out.println(hashCode);
		g=null;
		System.gc();
	System.out.println("End of garbage collection");
		
		 
		
	}
	

}
