package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookFlight {

	private static WebElement element = null;
	
	public static WebElement Chk_FirstName(WebDriver driver){
		element = driver.findElement(By.name("passFirst0"));
				return element;
		
	}
	
	public static WebElement Chk_LastName(WebDriver driver){
		element = driver.findElement(By.name("passLast0"));
		return element;
		
	} 
	
	public static WebElement Chk_creditnumber(WebDriver driver){
		element = driver.findElement(By.name("creditnumber"));
		return element;
		
	}
	
	public static WebElement btn_buyFlights(WebDriver driver) {
		element = driver.findElement(By.name("buyFlights"));
		return element;
		
		
	}
	
}
