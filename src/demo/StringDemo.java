package demo;

public class StringDemo {
	
	
	
	public static void main(String[] args) {
		
		String s = "oranium";     // String  literal --> SCP 
		
		String s2="oranium";      //SCP 
		
		String s3="welcome";
		
		String s1= new String("oranium");    // Heap memory 
		
		
		//equals --> Method          == --> operator 
		//equals -->  content comparision of the string 
		// ==   ---> Address comparision of the string 
		
	char[] c = s.toCharArray(); 
	
	for (int i=c.length-1;i>=0;i--)
	{
		System.out.println(c[i]);
	}
	}

}
