package StepDefinitionss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactorry.LoginPageFactorry;
import pageFactorry.homePageFactorry;

public class PageFactoryLoginStepsDefinition2 {
    static WebDriver driver;
    LoginPageFactorry login;
    homePageFactorry home;
    
    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/");  // Corrected URL
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) throws InterruptedException{
        login = new LoginPageFactorry(driver);
    	login.enterUsername(username);
        login.enterPassword(password);
    }

    @And("Clicks on Login Button")
    public void clicks_on_login_button() {  
       login.clickOnLoginButton();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        home = new homePageFactorry(driver);
        home.isCartDisplayed();
    }

    @And("Close the browser")
    public void close_the_browser() {
        driver.quit();  // Removed pending exception
    }
}

 