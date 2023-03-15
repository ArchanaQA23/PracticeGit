package demo;

public class Task {
	int mark = 78;                     
	char c ;                   
	
	public void checkMark()             // instance method 
	{
		if(mark>=91 && mark<=100)
		{
			c='A';
		}
		else if (mark>=80 && mark <=90)
		{
			c='B';
		}
		else if (mark>=70 && mark <=80)
		{
			c='C';
		}
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Task t = new Task();  
		t.checkMark();
		
		
	}

}
