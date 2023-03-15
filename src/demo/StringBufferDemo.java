package demo;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("welcome");  
		System.out.println(sb);   //welcome
		
		System.out.println(sb.hashCode());
		
		sb.append(" guys");    // Append function will add the string at the end 
		
		System.out.println(sb);
		
		System.out.println(sb.hashCode());
		
		sb.insert(1, "a");
		System.out.println(sb);  
		
		sb.reverse();
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.replace(1, 3, "kjd");
		
		System.out.println(sb);
		
		System.out.println(sb.hashCode());
	   
		
		
	}

}
