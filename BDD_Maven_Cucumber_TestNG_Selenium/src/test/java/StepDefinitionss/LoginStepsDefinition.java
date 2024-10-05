//package StepDefinitionss;
//
//import java.io.InterruptedIOException;
//import java.time.Duration;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.*;
//
//public class LoginStepsDefinition {
//    static WebDriver driver;
//
//    @Given("User is on login page")
//    public void user_is_on_login_page() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.get("https://www.saucedemo.com/");  // Corrected URL
//    }
//
//    @When("User enters valid {string} and {string}")
//    public void user_enters_valid_and(String string, String string2) throws InterruptedException{
//        driver.findElement(By.id("user-name")).sendKeys(string);
//        driver.findElement(By.id("password")).sendKeys(string2);
//    }
//
//    @And("Clicks on Login Button")
//    public void clicks_on_login_button() {
//        driver.findElement(By.id("login-button")).click();
//    }
//
//    @Then("User is navigated to Home Page")
//    public void user_is_navigated_to_home_page() {
//        Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() > 0,
//            "User is navigated to Home Page");
//    }
//
//    @And("Close the browser")
//    public void close_the_browser() {
//        driver.close();  // Removed pending exception
//    }
//}
//
// 