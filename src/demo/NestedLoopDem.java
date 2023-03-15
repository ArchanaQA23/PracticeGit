package demo;

public class NestedLoopDem {
	
	int a =10,b =20,c=40;
	
	public void printStar()
	{
		
		for(int row =1;row<=5;row++)    // row =2    2<=5   // * * * * * 
			                                                // * * 
		{
			for(int col=1;col<=5;col++)   //col=3  3<=5
			{
			
				System.out.print("* ");
				
				    
			}
			System.out.println();
		}
	
	}
	
	
	public static void main(String[] args) {
		NestedLoopDem n = new NestedLoopDem();
		n.printStar();
		
	}

}
