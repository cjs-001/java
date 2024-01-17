package pageobjects;

import org.openqa.selenium.WebDriver;

public class pageobjectmanager {
	
	public LandingPage landingPage;
	public offerpage offersPage;
	public WebDriver driver;
	//public CheckoutPage checkoutPage;
	
	public pageobjectmanager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public LandingPage getLandingPage()
	{
	landingPage= new LandingPage();
	 return landingPage;
	}
	
	
	
	public offerpage OffersPage()
	{
		offersPage = new offerpage(driver);
		return offersPage;
	}
	
	/*public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}*/

}
