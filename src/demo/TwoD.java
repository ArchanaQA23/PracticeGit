package demo;

public class TwoD {
	
	int tarr[][] =  { {10,20,30}, 
			          {40,50,60,90},
			          {70,80,90,89,89,67}           };
	
	public void checkTwoD()
	{
		System.out.println(tarr.length);     // 3 // Returns number of rows 
		System.out.println(tarr[0].length);   //4 // Returns number of columns 
		
		System.out.println(tarr[0][1]);     //20 
		
		 int[] arr= tarr[2];
		 
		 for(int a:arr)
		 {
			 System.out.println(a);
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (int row =2;row>=0;row--)    
		{
			for(int col=0;col<tarr[row].length;col++)    
			{
				System.out.print(tarr[row][col]+ " ");    
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("Using enhanced for loop ");

		
		for(int[] k : tarr)
		{
	
		for (int j:k)
		{
			System.out.print(j+" ");
		}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		TwoD t = new TwoD ();
		t.checkTwoD();
		
	}

}
