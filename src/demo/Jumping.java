package demo;

public class Jumping {
	
	public void checkContinue()
	{
		  for (int num =1; num<=10;num++)   
		  {
			  if(num==9 )                 
			  {
				  break;
			  }
			  
			  System.out.println(num);  
		  }
	}

	
	
	public static void main(String[] args) {
		Jumping j = new Jumping();
		j.checkContinue();
		
	}
}
