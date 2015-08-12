package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;

public class SignIn_Action {

public static void Execute(WebDriver driver){
	
	HomePage.txtbox_Username(driver).sendKeys("Mercury");
	HomePage.txt_Password(driver).sendKeys("Mercury");
	HomePage.button_submit(driver).submit();
			
}	
	
}  	
