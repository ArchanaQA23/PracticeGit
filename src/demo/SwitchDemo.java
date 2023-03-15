package demo;

public class SwitchDemo {
	
 String proof = "rationcard";
	
	public void checkSwitch()
	{
		switch(proof)   //switch(pan)
		{
		case "aadhar":
			System.out.println(proof +" is a valid proof to open the bank account ");
			break;
			
		case "pan":
			System.out.println(proof +" is a valid proof to open the bank account ");
			break;
			
		case "passport":
			System.out.println(proof +" is a valid proof to open the bank account ");
			break;
			
			default:
				System.out.println("Provide a valid proof ");
		
			
		}
	}
	

	
	
	public static void main(String args [])
	
	{
		SwitchDemo s = new SwitchDemo();   //oc 
		s.checkSwitch();                           //mcuo
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}

}
