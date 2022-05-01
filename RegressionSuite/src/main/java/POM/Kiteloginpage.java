package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
    @FindBy(xpath = "//img[@alt=\"Kite\"]") private WebElement kitelogo;
    @FindBy(xpath = "//h2[text()='Login to Kite']") private WebElement kiteText;
    @FindBy(xpath = "//input[@id=\"userid\"]") private WebElement userName;
	@FindBy(xpath = "//input[@id=\"password\"]") private WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement logintab;
	@FindBy(xpath = "//input[@id=\"pin\"]")private WebElement pintab;
	@FindBy(xpath = "//a[text()=\"Forgot password?\"]") private WebElement forgottab;
	@FindBy(xpath = "//img[@alt=\"Zerodha\"]") private WebElement zerodhatab;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signupnow;

  public Kiteloginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
  public void ClickOnkitelogo()
    {
        kitelogo.click();	
    }
  
  public void Checktext()
  {
      System.out.println(kiteText.getText());
  }
	
  public void enterUserName(String name)
   {
       userName.sendKeys(name);	
   }

  public void enterpassword(String pass)
   {
      password.sendKeys(pass);	
   }

  public void ClickOnlogintab()
  {
      logintab.click();	
  }
  
  public void pincode(String pin)
  {
	  pintab.sendKeys(pin);
  }
 
  public void ClickOnforgottab()
  {
     forgottab.click();	
  }

  public void ClickOnzerodhatab()
  {
    zerodhatab.click();   
  }

  public void ClickOnsignupnowtab()
  {
    signupnow.click();	
  }

}
