package demo;

public class ArrayDemo {
	
	
	public static void main(String[] args) {
		int arr[ ] = {10,20,30,40,50,60};      //Array declaration 

		
	   
	    	System.out.println(arr[1]);    //20
	    	System.out.println(arr[3]);     //40 
	    	System.out.println(arr.length);    //6
	    	System.out.println("Reverse traversal ");
	    	
	    	for (int i =arr.length-1; i>=2;i--)   //i =1   1<6
	    	{
	    		
	  		System.out.println(arr[i]);   //arr[1] = 10 
	    
	}
	    	
	    	System.out.println("Using enhanced for loop ");
	    	// arr[ ] = {10,20,30,40,50,60}; 
	    	
	    	//unidirectional loop --> forward 
	    	for (int k : arr)
	    	{
	    		
	    		System.out.println(k);
	    	}
	    	
	    	
	    	
	    	
	    	
}
}	
