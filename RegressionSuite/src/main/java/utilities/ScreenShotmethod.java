package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotmethod {
	
	
	public static void ScreenShotM(WebDriver driver) throws IOException
	{
	Random rko = new Random();
	int first = rko.nextInt(100);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("D:\\ScreenShot"+first+".png");
	FileHandler.copy(source, destination);
    }

	public static void ScreenShotM2(WebDriver driver, String a) throws IOException
	{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("D:\\ScreenShot"+a+".png");
	FileHandler.copy(source, destination);
    }
	
 
	
	
	
}
