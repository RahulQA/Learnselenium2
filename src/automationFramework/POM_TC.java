package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import pageObjects.HomePage;
import pageObjects.ReservationPage;
import pageObjects.SelectFlightPage;
import pageObjects.BookFlight;


public class POM_TC {

	private static WebDriver driver = null;
		
	public static void main(String[] args) throws InterruptedException {
		
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	
		
	HomePage.txtbox_Username(driver).sendKeys("mercury");
	HomePage.txt_Password(driver).sendKeys("mercury");
	HomePage.button_submit(driver).click();
	
	ReservationPage.Radiobtn_oneway(driver).click();
	ReservationPage.DL_Passenger(driver);
	ReservationPage.DL_FromPort(driver);
	ReservationPage.DL_ArrivingIn(driver);
	ReservationPage.Radiobtn_SerViceClass(driver).click();
	ReservationPage.btn_continue(driver).submit();
	
	SelectFlightPage.btn_continue(driver).click();
	
	BookFlight.Chk_FirstName(driver).sendKeys("Rahul");
	BookFlight.Chk_LastName(driver).sendKeys("Rathore");
	BookFlight.Chk_creditnumber(driver).sendKeys("4444333322221111");
	BookFlight.btn_buyFlights(driver).click();
	driver.quit();
//	
	//Test Case with Blank User Name
	
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	
	HomePage.txtbox_Username(driver).sendKeys("");
	HomePage.txt_Password(driver).sendKeys("mercury");
	HomePage.button_submit(driver).click();
	String Title = driver.getTitle();
	System.out.println(Title);
	
	if (Title=="Sign-on: Mercury Tours")
	System.out.println("Pass");
	else 
	System.out.println("Fail");
	
	}

}
