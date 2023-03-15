package demo;

public class ConditionalDemo {
	
	int num=21;
	public void checkNestedIf()
	{
	
		if(num%2==0)
		{
			System.out.println(num +" is completely divisible by 2 ");
			if(num%4==0)        //64 
			{
				System.out.println(num +" is completely divisible by 4");
				if(num%8==0)
				{
					System.out.println(num +" is completely divisible by 8");
					if(num%16==0)
					{
						System.out.println(num +" is completely divisible by 16 ");
					}
					else
					{
						
					}
				}
				else
				{
					
				}
			}
			else
			{
				
			}
		}
		else
		{
			System.out.println(num + "is not completely divisible by 2 ");
		}
	}
	
	
	
	public static void main(String args[])
	{
		
		ConditionalDemo c= new ConditionalDemo();   //oc
		c.checkNestedIf();
		
		
	}
	

}
