package staticDemo;

import java.util.HashMap;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		String s ="Hello World";
		
		HashMap<Character, Integer> h=new HashMap<>();
		
		char[] character = s.toCharArray();
		
		for(char c :character)
		{
			if (h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
			}
			
			else
			{
				h.put(c, 1);
			}
		}
		System.out.println(h);
		
	}

}
