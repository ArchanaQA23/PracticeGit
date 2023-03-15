package abstraction;

public class DemoStaticProgram {
	
	String sname;
	int sid;
	static String cname;
	
	
	
	
	public void demoStatic(String a, int b)
	{
		
		sname=a;
		sid=b;
		
		
		System.out.println("Student Name is:"+sname); 	
		System.out.println("Student id is:"+sid);
		System.out.println("Student college name is:"+cname);
		
		
	}
	
	static
	{
		
		cname="Oranium";
		
		System.out.println("Hi this is Static Block");
		
	}
	
	public static void sampleStatic()
	{
		
		
		System.out.println("Hi this is static method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		DemoStaticProgram d = new DemoStaticProgram();
		d.demoStatic("Pradeep", 1);
		d.demoStatic("Sathish", 2);
		d.demoStatic("Jankiraman", 3);
		
		//sampleStatic();
		
		DemoStaticProgram.sampleStatic();
		
	}

}
