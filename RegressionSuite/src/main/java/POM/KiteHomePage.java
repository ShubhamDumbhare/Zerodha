package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	 
	@FindBy(xpath = "//input[@type=\"text\"]")private WebElement searchbox;
	@FindBy(xpath = "//label[@for=\"radio-390\"]")private WebElement bseRadiotab;
	@FindBy(xpath = "//label[text()=\"Regular\"]")private WebElement regulartab;
    @FindBy(xpath = "//label[@for=\"radio-397\"]")private WebElement intraRadiotab;
    @FindBy(xpath = "//label[@for=\"radio-961\"]")private WebElement slRadiotab;
    @FindBy(xpath = "//input[@label=\"Qty.\"]")private WebElement qtytab;
    @FindBy(xpath = "//input[@label=\"Price\"]")private WebElement pricetab;
    @FindBy(xpath = "//input[@label=\"Trigger price\"]")private WebElement targetprice;
    @FindBy(xpath = "//label[@for=\"radio-1126\"]")private WebElement dayRadiotab;
    @FindBy(xpath = "//button[@type=\"submit\"]")private WebElement Buytab;
    
    
    public KiteHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
	public void LogIn(String name) {
		
	}
	

}
