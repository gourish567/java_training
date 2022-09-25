package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
public class NewClass 
{
    WebDriver driver=null;
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    String expectedResult,actualResult;
	    expectedResult="PIN";
	    actualResult=driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']//h6")).getText();
	    SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualResult, expectedResult);
	    }
	@Then("Log out")
	public void log_out() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//p")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li[4]")).click();
		
	}
}
