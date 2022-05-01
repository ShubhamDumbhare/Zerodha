package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpom {
	
	@FindBy(xpath = "//input[@id=\"email\"]") private WebElement emailfield;
	@FindBy(xpath = "//input[@id=\"pass\"]") private WebElement passfield;
    @FindBy(xpath = "//button[@id=\"loginbutton\"]") private WebElement Logintab;
    
    public Fbpom(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void EnterEmailfield(String email)
    {
    	emailfield.sendKeys(email);
    }
    
    public void EnterPassword(String pass)
    {
    	passfield.sendKeys(pass);
    }
    
    public void ClickOnLogIn()
    {
    	Logintab.click();
    }

}
