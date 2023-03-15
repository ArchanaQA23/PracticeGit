package staticDemo;

public class StaticDemo {
	
	
	int id ;                           //variable declaration 
	String name ;
	static  String cname="SRM";     //static variable declare 
	
//	static               //static block 
//	{
//		cname ="SRM";          //static variable initialization 
//	}
	
	public void displayStud(int id , String name,String cname ) {
		
		this.id =id ;
		this.name =name;
		this.cname  = cname;
		
		System.out.println("Name of the student is :" +name);
		System.out.println("ID of the student is :" +id);
        System.out.println("College name is : " +cname );
        
        System.out.println("****************");
		
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo s = new StaticDemo();
		s.displayStud(90,"Raj", cname);   // 4    10  10
		s.displayStud(897,"Ram", cname);   // 4    10  10
		s.displayStud(789, "Janu", cname);  // 4    10  10
		
	}

}
