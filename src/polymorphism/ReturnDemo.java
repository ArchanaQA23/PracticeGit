package polymorphism;

public class ReturnDemo {
	
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public int[] returnarr()
	{
		int a[]= {89,78,90};
		return a;
	}
	
	
	public static void main(String[] args) {
		
		ReturnDemo r = new ReturnDemo();
		
		int arr[]= {20,30,40};
		r.display(arr);
		System.out.println("REturning an array ");
		
		int[] b = r.returnarr();
		
		for(int i =0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	
		
		
		
		
	}

}
