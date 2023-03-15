package abstraction;

public class NewWhatsApp extends OldWhatsApp{
	
	public void whatsApp()
	{
		
		System.out.println("New Whatsapp");
	}
	
	
	public static void main(String[] args) {
		
		
		NewWhatsApp n= new NewWhatsApp();
		n.whatsApp();// child New Whatsapp
		n.whatsApp();// parent Old Whatsapp
		
		
	}

}
