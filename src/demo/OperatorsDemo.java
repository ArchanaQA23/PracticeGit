package demo;
class OperatorsDemo {

	int a = 20, b = 30;     
	String s ="selenium";
	// variables
	

	String s1 ="selenium";
	public void concatOps()
	{
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println("welcome" + " guys" +  " for java batch");
		System.out.println(s.replaceAll(s1, "oranium"));
		System.out.println(s.replace('s','m'));
	}
	
	public static void main(String args[])
	{ 
		OperatorsDemo o = new OperatorsDemo(); // oc
		//o.shortHandOps();
		//o.incDecOps();
		o.concatOps();
		System.out.println(o.a);
		
	}

}
