package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerpage {
	
	
	public WebDriver driver;


	public offerpage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	


	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("tr td:nth-child(1)");
	
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String getSearchText()
	{
		return driver.findElement(search).getText();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}

}
