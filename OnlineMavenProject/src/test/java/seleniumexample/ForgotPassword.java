package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	WebDriver driver = new ChromeDriver();
	
	  void login() throws InterruptedException
	  {
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//form//p")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button")).click();
			
	  }
	  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		ForgotPassword obj=new ForgotPassword();
		obj.login();
	}
}
