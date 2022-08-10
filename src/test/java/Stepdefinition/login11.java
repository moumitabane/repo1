package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login11 {
	
		@Given("testme application is launched successfully")
		public void testme_application_is_launched_successfully() {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new cucumber.api.PendingException();
			System.out.println("code for launch");
		}

		@When("user enters the valid {string} # reference to the variables {string} string, <> int")
		public void user_enters_the_valid_reference_to_the_variables_string_int(String string, String string2) {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new cucumber.api.PendingException();
			System.out.println("code entering the username");
			System.out.println("The username considered this time is : " + string);
			
		} 
		
		@When("valid {string}")
		public void valid(String string) {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new cucumber.api.PendingException();
			System.out.println("code entering the password");
			System.out.println("The password considered this time is : "+ string);
		}

		@Then("submits the credentials by clicking on login button in testme")
		public void submits_the_credentials_by_clicking_on_login_button_in_testme() {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new cucumber.api.PendingException();
			System.out.println("code for submission");
		}

		@Then("verfies the login status in testmeapp")
		public void verfies_the_login_status_in_testmeapp() {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new cucumber.api.PendingException();
			System.out.println("code for status check");
			
		}
		@When("user add {int} itemes to the cart")
		public void user_add_itemes_to_the_cart(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new cucumber.api.PendingException();
			System.out.println("code for selecting the items");
			System.out.println("Number of items considered this time :"+ int1);
		}
	}


