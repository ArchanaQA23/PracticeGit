package demo;

public class ReverseString {

	public static void main(String[] args) {
		String s = "oranium";
        String revstr="";
        
		for (int i=s.length()-1; i>=0;i-- )    // 5    5>=0
		{
			revstr= revstr+s.charAt(i);   //revstr= +mu
		}
		
		System.out.println(revstr);  // muinaro
	}

}
