package Test;

import java.io.IOException;


import java.util.Random;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import POM.Kiteloginpage;

import pojo.LaunchBrowser;
import utilities.Paramertization;
import utilities.ScreenShotmethod;


	 @Listeners(TestAutomation.Listeners.class)
	 
     public class KiteTest {

	
	 WebDriver driver;
	
	@BeforeMethod
	public void  OpenBrowser()
	{
	 driver = LaunchBrowser.CallBrowser();
	}
	
	@Test
	public void  loginToZerodhaWithValidCredentials() throws EncryptedDocumentException, IOException
	{
	 Kiteloginpage pom = new Kiteloginpage(driver);

	 String user = Paramertization.DataFromExcel("input", 0, 0);
	 pom.enterUserName(user);
	 
	 String pass = Paramertization.DataFromExcel("input",1 , 4);
	 pom.enterpassword(pass);

	 pom.ClickOnlogintab();
	}
	
	@Test
	public void random1(ITestResult result) throws IOException
	{
	 Kiteloginpage pom1 = new Kiteloginpage(driver);
	 pom1.Checktext();
	
	}
	
	
	@AfterMethod
	public void random(ITestResult result) throws IOException
	{
	 try {
		 
		    if(result.getStatus() == ITestResult.FAILURE)
		      {
		        ScreenShotmethod.ScreenShotM2(driver,result.getName());
		      }
	     }    
		    catch(IOException e)
		      {
			    e.printStackTrace(); 
		      }
       
	 
    }
	
}	

