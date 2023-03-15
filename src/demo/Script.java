package demo;

public class Script {
	
	char c ='&';					//variables 
	
    public void printCharacter()
    {
    		System.out.println(c);															//methods 
    }
	
	
	public static void main(String args[]) 
	{
		Script s=new Script();				 										//object creation 
	    s.printCharacter();													//method call using object 
	    System.out.println(s.c);
	}
	
	

}
