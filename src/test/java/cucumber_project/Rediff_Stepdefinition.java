package cucumber_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rediff_Stepdefinition {
	
	public static WebDriver driver;
	String url="https://www.rediff.com/";
	SoftAssert softassert= new SoftAssert();
	ChromeOptions options=new ChromeOptions();
	
	@Given("I open firefox browser")
	public void I_Open_Firefox() {
	driver= new ChromeDriver();	
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}
    @And("i enter the URl link https://www.rediff.com/")
    public void I_Enter_URL() {
    	driver.get("url");
		
	}
    
    @Then("I click on sign in Link")
    public void I_click_Signin() {
		driver.findElement(By.className("signin")).click();
	}
    
    @And("I enter rediffmail page")
    public void I_Enter_Rediffmail() {
		
	}
    
    @And("I enter the correct username and password")
    public void I_Enter_Password() {
    	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
	
	}
    
    @Then("i clicked signin button")
    public void I_Checked_Signin() {
    	driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
    
   @And("I checked if I am inbox mail of RediffMail")
    public void I_Checked_Inbox() {
	softassert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'SeleniumPanda ')]")).isDisplayed());
	softassert.assertAll();
   }
   
   @Given("I am inside mailbox of rediff")
   public void I_inside_Inbox() {
	
	}
   
   @And("I validate the presence of logout link")
   public void I_Validate_Presence() {
	softassert.assertTrue(driver.findElement(By.className("rd_logout")).isEnabled());
	softassert.assertAll();
	}
   
   @When("I clicked on logout link")
   public void I_Clicked_logout() {
	   driver.findElement(By.className("rd_logout")).click();
	}
   
   @Then("i am logged out of the rediffmail")
   public void I_Logged_Inbox() {
	softassert.assertTrue(driver.findElement(By.xpath("//p[text()='You have successfully signed out of Rediffmail.']")).isDisplayed());
	softassert.assertAll();
   }
   
   @And("I can validate rediffHome page")
   public void I_Validate_RediffHome() {
   softassert.assertTrue(driver.findElement(By.xpath("//b[text()='Rediff Home']")).isDisplayed());
   softassert.assertAll();   
   }
   
   @But("I finally close the browser")
   public void I_Finally_CloseBrowser() {
	   driver.close();
   }

}
