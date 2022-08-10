package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelOrder {
	WebDriver driver;
    @Given("the user has logged in successfully")
    public void the_user_has_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
//      throw new cucumber.api.PendingException();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.a.banerjee\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
        driver.findElement(By.name("userName")).sendKeys("TestQAHYD1");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.name("Login")).click();

    }

    @Then("user verifies for the active order")
    public void user_verifies_for_the_active_order() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        System.out.println("code for checking active order");
    }

    @When("User clicks cancel order")
    public void user_clicks_cancel_order() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        System.out.println("code for cancel order");
    }

    @When("user logout from the application")
    public void user_logout_from_the_application() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    	//Assert.assertEquals(2, 1);
        System.out.println("code for logout");
    }
    
    @Then("user places another order")
    public void user_places_another_order() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    	 System.out.println("User places another order");
    }

}
	
	
	
	
	
	
	
	