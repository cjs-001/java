package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.LandingPage;
import pageobjects.offerpage;
import utils.TextContextSetup;

public class offerspagestepdefinition {
	
public WebDriver driver;
public String offerpageproductname;
 TextContextSetup textcontextsetup;
public offerpage offerpage;

	
 public offerspagestepdefinition(TextContextSetup textcontextsetup)
{
	this.textcontextsetup = textcontextsetup;
	this.offerpage =textcontextsetup.pageObjectManager.OffersPage();
}
	
	
	@Then("^user searched for (.+) shortname in offers page$")
    public void user_searched_for_shortname_in_offers_page(String name) throws Throwable {
		switchToOffersPage();
		Thread.sleep(5000);
		//offerpage.searchItem(name);
        //driver.findElement(By.id("input#search-field")).click();
		offerpage.searchItem(name);
		//textcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name);
        String offerpageproductname = offerpage.getSearchText();
        System.out.println(offerpageproductname);
        
       
        
    }
	
	public void switchToOffersPage()
	{
		//if switched to offer page-> skip below part
		LandingPage landingPage  =textcontextsetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		textcontextsetup.utils.SwitchWindowToChild();
		//explicit wait, parse string
		
		
	}
    
    @And("^validate product name in offers page matches with Landing Page$")
    public void validate_product_name_in_offers_page_matches_with_landing_page() throws Throwable {
        
    	if (textcontextsetup.landingPageProductName==offerpageproductname)
        {
    		System.out.println("matched");
    	}
        else {
        	System.out.println("failed");
        }

    }
    
}
