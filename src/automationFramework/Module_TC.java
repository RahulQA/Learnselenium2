package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignIn_Action;

public class Module_TC {
	 
	 private static WebDriver driver = null;
	 
	 public static void main(String[] args) {
		 
		 driver = new FirefoxDriver();
		 
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	     driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	        
	     SignIn_Action.Execute(driver);
	        
	     System.out.println("Login Successfully, now it is the time to Log Off buddy.");
	        
	 }
	
	
	
}