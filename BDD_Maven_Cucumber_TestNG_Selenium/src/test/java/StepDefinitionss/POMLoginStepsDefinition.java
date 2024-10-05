//package StepDefinitionss;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.loginPpage;
//
//public class POMLoginStepsDefinition {
//	WebDriver driver;
//	loginPpage login;
//    @Given("User is on login page")
//    public void user_is_on_login_page() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.get("https://www.saucedemo.com/");  // Corrected URL
//    }
//
//    @When("User enters valid {string} and {string}")
//    public void user_enters_valid_and(String username, String password) throws InterruptedException{
////        driver.findElement(By.id("user-name")).sendKeys(string);
////        driver.findElement(By.id("password")).sendKeys(string2);
//    	login = new loginPpage(driver);
//    	login.enterUsername(username);
//    	login.enterPassword(password);
//    }
//
//    @And("Clicks on Login Button")
//    public void clicks_on_login_button() {
//    	login.clickLogin();
////        driver.findElement(By.id("login-button")).click();
//    }
//
//    @Then("User is navigated to Home Page")
//    public void user_is_navigated_to_home_page() {
////        Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() > 0,
////            "User is navigated to Home Page");
//    	login.isLogoDisplayed();
//    }
//
//    @And("Close the browser")
//    public void close_the_browser() {
//        driver.close();  // Removed pending exception
//    }
//}
