package Stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class CartDemo {
		
		WebDriver driver;
	    //@Given("the user has logged in successfully")
	    //public void the_user_has_logged_in_successfully() {
	        // Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.a.banerjee\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        //driver = new ChromeDriver();
	        //driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
	        //driver.findElement(By.name("userName")).sendKeys("TestQAHYD1");
	        //driver.findElement(By.name("password")).sendKeys("Password123");
	       // driver.findElement(By.name("Login")).click();

	    //}
		
		
	    @Given("user  launches the application")
	    public void user_launches_the_application() {
	        // Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	        System.out.println("code for launch application");
	    }

	    @Then("enters the valid username")
	    public void enters_the_valid_username() {
	        // Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	        System.out.println("code for valid username");
	    }

	    @Then("enter valid password")
	    public void enter_valid_password() {

	        System.out.println("code for valid password");
	    }

	    @When("clicks on submit user login is success")
	    public void clicks_on_submit_user_login_is_success() {
	        // Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	        System.out.println("code for login success");
	    }


          @Given("user search resulted in a valid prodcut")
           public void user_search_resulted_in_a_valid_prodcut()  {
	        // Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	        System.out.println("code for search item");
	    }


          @Then("user clicks on button to add the item to cart")
           public void user_clicks_on_button_to_add_the_item_to_cart() {
// Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	    	Assert.assertEquals(2, 1);
	        System.out.println("code for click on add symbol");
	    }

	    @Given("user has atleast one item in the cart")
	    public void user_has_atleast_one_item_in_the_cart() {
	        // Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	        System.out.println("code for item check in cart");
	    }

	    @Then("user clicks minus symbol next to cart")
	    public void user_clicks_minus_symbol_next_to_cart() {
	        // Write code here that turns the phrase above into concrete actions
//	        throw new cucumber.api.PendingException();
	    	
	        System.out.println("code for click on minus symbol");
	    }
	        
	        @Then("the item is not deletd from the cart")
	        public void the_item_is_not_deletd_from_the_cart() {
	        	System.out.println("The item is not deleted from cart");

	    }

	}


