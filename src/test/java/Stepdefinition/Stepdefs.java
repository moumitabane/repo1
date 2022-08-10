package Stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {



	private WebDriver driver;
    static int numberOfProducts; 
    @Given("Alex is on the login page")
    public void alex_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.a.banerjee\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/loginhere.htm");

    } 

    @When("Alex enters correct credentials")
    public void alex_enters_correct_credentials() {
        driver.findElement(By.name("userName")).sendKeys("TestQAHYD1");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.name("Login")).click();
    }

    @When("Alex enters username {string}")
    public void alex_enters_username(String username) {
        driver.findElement(By.name("userName")).sendKeys(username);

    }

    @When("Alex enters password {string}")
    public void alex_enters_password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("Alex click on login")
    public void alex_click_on_login() {
        driver.findElement(By.name("Login")).click();
    }

    @Then("Alex can do successful login")
    public void alex_can_do_successful_login() {
        Assert.assertTrue(driver.getTitle().contains("Home"));

    }


    @When("user searches the below product:")
    public void user_searches_the_below_product(DataTable productsName) throws Exception {
        driver.findElement(By.name("userName")).sendKeys("TestQAHYD1");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.name("Login")).click();
        Thread.sleep(5000);
        List<String> products = productsName.asList();

        for(String eachProduct : products){
            driver.findElement(By.id("myInput")).sendKeys(eachProduct);
            driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();

            try{
                driver.findElement(By.linkText("Add to cart")).click();
                numberOfProducts++;    
            }catch(Exception  e){

            }
            driver.findElement(By.linkText("Home")).click();
        }
    }
    
    @Then("available products should be added to cart")
    public void available_products_should_be_added_to_cart() {

        WebElement  countofProducts =driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b"));
        String countProducts = countofProducts.getText();
        int  countProductsInInt = Integer.parseInt(countProducts);
        Assert.assertEquals(numberOfProducts, countProductsInInt);
    }
}