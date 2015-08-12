package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightConfirmation {

	private static WebElement element = null;
	
	public static WebElement Chk_FirstName(WebDriver driver){
		element = driver.findElement(By.name("passFirst0"));
				return element;
		
	}
	
	
}
