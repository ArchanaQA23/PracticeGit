package demo;

public class StringMethods {

	public static void main(String[] args) {
		
		String s ="oraniumi";
		String s1="ORANIUM";		
		String s2 ="    Welcome guys      ";
		String s3 ="Welcome Java Programming";
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());   //oranium
		System.out.println(s2);
		System.out.println(s2.trim());   // Removes leading and trialing space 
		
		System.out.println(s.indexOf('i'));   //4 Returns the first occurence of character 
		
		System.out.println(s.lastIndexOf('i'));   //7 Returns the last occurence of character
		
		System.out.println(s.charAt(6));           // m  Returns the character of an index 
		
		System.out.println(s.startsWith("oran"));   //true 
		
		System.out.println(s.endsWith("um"));      //false
		
		System.out.println(s.contains("ran"));      // true
		
		System.out.println(s.concat(s1));     //oraniumiORANIUM
		
		// Cut down the string 
		
		System.out.println(s.substring(1));   // raniumi
		
		System.out.println(s.substring(1, 6));  // begining index is inclusive and ending is exclusive 
		// raniu
		
		System.out.println(s.length());  // Returns the number of character 
		
		// toCharArray() method will break each one of the characters in a string 
		
		char[] c = s.toCharArray();  //  {'o','r','a','n','i','u','m'}
		
		for(char character: c )
		{
			System.out.println(character);
		}
		
		System.out.println();
		
		System.out.println("Using split function ");
		
		String[] split = s3.split(" ");  // {"welcome" ,"java", "programming"}
		
		for(String sp:split)

		{
			
			System.out.println(sp);
		}
		
	
	}
}
