package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static WebDriver CallBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY LEC\\selinium\\chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
	}
  
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","D:\\VELOCITY LEC\\FireFox\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	
}
