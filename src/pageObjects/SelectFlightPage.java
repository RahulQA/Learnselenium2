package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlightPage {

private static WebElement element = null;
	
public static WebElement btn_continue(WebDriver driver){
	element = driver.findElement(By.name("reserveFlights"));
			return element;
	
}
	
	
}
