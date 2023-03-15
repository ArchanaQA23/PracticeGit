package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	
	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\eclipse-workspace\\NewDemo\\JAVA_9AMBatchFeb7\\driver\\chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");   // To open the url 
	   
	   
	}

}
