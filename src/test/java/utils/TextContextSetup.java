package utils;

import org.openqa.selenium.WebDriver;

import pageobjects.pageobjectmanager;

public class TextContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public pageobjectmanager pageObjectManager;
	public testbase Testbase;
	public genericutils utils;
	
	public TextContextSetup()
	{
		Testbase = new testbase();
		pageObjectManager = new pageobjectmanager(Testbase.WebDriverManager());
		utils = new genericutils(Testbase.WebDriverManager());
	}

}
