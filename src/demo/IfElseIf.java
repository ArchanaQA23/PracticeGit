package demo;

public class IfElseIf {
	int weeknumber = 12; 
	
	public void checkIfElseIFLadder()
	{
		if(weeknumber==1)    //3==1
		{
			System.out.println("Sunday");
		}
		else if(weeknumber==2)   //3==2
		{
			System.out.println("Monday");
		}                             //3==3
		else if (weeknumber==3)
		{
			System.out.println("Tuesday");
		}
		else if (weeknumber ==4)
		{
		System.out.println("Wednesday");
		}
		else
		{
			System.out.println("provide a valid week number..");
		}
	}
	
	
public static void main(String[] args) {
	
	
	IfElseIf i = new IfElseIf();
	i.checkIfElseIFLadder();
	
}

}
