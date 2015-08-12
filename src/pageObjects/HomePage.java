package pageObjects;

//import utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	
	public static WebElement txtbox_Username(WebDriver driver){
		element = driver.findElement(By.name("userName"));
		//Log.info("My Account link element username found");
		return element;
				
	}
	
	public static WebElement txt_Password(WebDriver driver){
		element = driver.findElement(By.name("password"));
		//Log.info("My Account link element password found");
		return element;
	}
	
	public static WebElement button_submit(WebDriver driver){
		element = driver.findElement(By.name("login"));
		//Log.info("Login button found");
		return element;
	}

	
	
	
}
