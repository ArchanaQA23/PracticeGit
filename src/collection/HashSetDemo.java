package collection;

import java.util.*;  //asterik

public class HashSetDemo {

	public static void main(String[] args) {
		TreeSet <Object> a =new TreeSet<>();
		a.add("Oranium");
		a.add("Tech");
		a.add("90");
		a.add("10.0");
		
		//a.add(null);
		a.add("u");
		a.add("Oranium");
		
		System.out.println(a);
		
		System.out.println("Reg functionality added by nirosha ");
	   boolean contains = a.contains("Tech");
	   System.out.println(contains);
	   
	   int size = a.size();
	   System.out.println(size);
	   
	   //a.remove(true);
	   //System.out.println(a);
	   System.out.println("Converted set into an array");
	   Object[] arr = a.toArray();
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   
	   System.out.println("Using enhancced for loop");
	   
	   for(Object k : a)
	   {
		   System.out.println(k);
	   }
	   
	   System.out.println("Using iterator method ");
	   
	   Iterator<Object> i = a.iterator();
	   
	   while(i.hasNext())   //hasNext()---> boolean
	   {
		   System.out.println(i.next());
		   
	   }
	   
	   System.out.println("Using lambda expression");
	   a.forEach(k->System.out.println(k));
	   
	   
	   
	   
	   
		
		
	}
}
