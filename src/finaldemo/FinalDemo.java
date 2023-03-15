package finaldemo;

public  class FinalDemo {      // it cannot be extended by any other class 
	
	char c ='A';  //65
	char c1='a';   //97 
	final int a =90;
	
	public final void display()
	{
		System.out.println(c+c1);
	}
	
	public static void main(String[] args) {
		
		FinalDemo f = new FinalDemo();
		f.display();
		//f.a=89;  we cannot change it 
		
	}


}
