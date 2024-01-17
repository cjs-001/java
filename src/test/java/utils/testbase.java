package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {

	
	public TextContextSetup textcontextsetup;
	public WebDriver driver;
	//public static WebDriver driver;
	public WebDriver WebDriverManager()
	{
		if(driver == null)
		{
			
		System.setProperty("webdriver.chrome.driver","C://Users//cjadmin.questlab//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();// driver gets the life
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		
		return driver;
	}
}
