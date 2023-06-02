package cucumber_project;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Test_StepDefinition {
	
	
	
	@Given("I open chrome browser")
	public void I_Open_chrome() {
		System.out.println("I open chrome browser");
	}
	
    @And("I enter URL")
    public void I_Enter_Url() {
    	System.out.println("I enter URL");
    }
    
    @Then("I can see landing page")
    public void I_can_See_Page() {
    	System.out.println("I can see landing page");
    }
    
    @And("I enter the correct username and password")
    public void I_Enter_Username() {
    	System.out.println("I enter the correct username and password");
    }
    @And("I clicked login button")
    public void I_Checked_login() {
    	System.out.println("I clicked login button");
    }

}
