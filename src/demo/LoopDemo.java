package demo;

public class LoopDemo {

	
	public void checkForLoop() {
		
		for(int num=1 ; num<=10 ; num++)  // 11    11<=10
		{
			System.out.println(num);      //10
		}
		System.out.println("Came out from for loop");
	
	}
		
	
	
	public static void main(String args [])
	{
		LoopDemo l = new LoopDemo ();
		l.checkForLoop();
		
	}

}
