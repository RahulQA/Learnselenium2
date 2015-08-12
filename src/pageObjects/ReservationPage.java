package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {

	private static WebElement element = null;
	
	public static WebElement Radiobtn_roundtrip(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		return element;
	}

	public static WebElement Radiobtn_oneway(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@value='oneway']"));
		return element;
	}
	
	public static WebElement DL_Passenger(WebDriver driver){
		element = driver.findElement(By.name("passCount"));
		Select se = new Select(element);
		se.selectByIndex(1);
		return element;
	}
	
	public static WebElement DL_FromPort(WebDriver driver){
		element = driver.findElement(By.name("fromPort"));
		Select se = new Select(element);
		se.selectByValue("Frankfurt");
		return element;
	}
	
	public static WebElement DL_ArrivingIn(WebDriver driver){
		element = driver.findElement(By.name("toPort"));
		Select se = new Select(element);
		se.selectByValue("London");
		return element;
	}
	
	
	public static WebElement btn_continue(WebDriver driver){
		element = driver.findElement(By.name("findFlights"));
				return element;
		
	}
	
	public static WebElement Radiobtn_SerViceClass(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@value='First']"));
		return element;
	}
	
}
