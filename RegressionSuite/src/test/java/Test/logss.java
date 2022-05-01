package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Fbpom;
import pojo.LaunchBrowser;
import utilities.ScreenShotmethod;
public class logss {
	
 static Logger log = Logger.getLogger(logss.class.getName());
 	
 WebDriver driver;
 
 @BeforeTest 
 public void opentheBrowser() 
 {
 driver = LaunchBrowser.openFirefoxBrowser();

 }
 
 @Test
 public void FbloginPageWithValidCredentials()
 {
	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	 Fbpom pom = new Fbpom(driver);
	 pom.EnterEmailfield("Shubham Dumbhare");
	 pom.EnterPassword("password");
	 pom.ClickOnLogIn();		 
 }
 
 @AfterMethod
 public void Screenshot() throws IOException
 {
	ScreenShotmethod.ScreenShotM(driver); 
 }

}
