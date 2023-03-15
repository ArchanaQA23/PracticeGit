package demo;

public class MethodDemo {
	
	
	public int[] add(int[] arr)  
	{
		return arr;
		
	}
	
	public static void main(String[] args) {
		MethodDemo m  = new MethodDemo();
		
		int[] a= {90,89,89};
		
		int[] add = m.add(a);
		
	}

}
