package demo;

public class ForLoopDemo {
	
	public void checkSum()
	{
		int mind =0;
		for(int num=1;num<=10;num++)   //11   11<=10
		{
			mind=mind+num;     //mind =45+10   mind =55
			
		}
	   System.out.println(mind);
	}

	
	
	public static void main(String[] args) {
		ForLoopDemo f = new ForLoopDemo();
		f.checkSum();
		
		
	}
}
