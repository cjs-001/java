package stepDefinitions;



import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import utils.TextContextSetup;

public class homePageStepDefinitions {
	
public WebDriver driver;
public String landingpageproductname;
public String offerpageproductname;
public TextContextSetup textcontextsetup;
public LandingPage landingPage;


public homePageStepDefinitions(TextContextSetup textcontextsetup)
{
	//this.textcontextsetup = textcontextsetup;
	this.landingPage =textcontextsetup.pageObjectManager.getLandingPage();
}
	
        @Given("^User is on GreenCart Landing page$")
	    public void user_is_on_greencart_landing_page() throws Throwable {
	        
	     //   System.setProperty("webdriver.chrome.driver","C://Users//cjadmin.questlab//Downloads//chromedriver_win32//chromedriver.exe");
	       // textcontextsetup.driver = new ChromeDriver();
	      //  textcontextsetup.driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	        
	        
	    }
        
        @When("^user searched with Shortname (.+) and extracted actual name of product$")
        public void user_searched_with_shortname_and_extracted_actual_name_of_product(String name) throws Throwable {
        	
        //	LandingPage obj = new LandingPage();
        //	obj.searchItem(name);
        landingPage.searchItem(name);
        //textcontextsetup.driver.findElement(By.cssSelector("input.search-keyword")).sendKeys(name);
        
        Thread.sleep(2000);
        String landingpageproductname = landingPage.getProductName().split("-")[0].trim();
         Thread.sleep(2000);
         landingPage.selectTopDealsPage();
         //textcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
         System.out.println(landingpageproductname);
         
        }
        

        
        	
  }
        


