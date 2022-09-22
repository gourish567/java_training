package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("C:\\training\\HTML\\WebTable.html");
		driver.findElement(By.xpath("//table//tbody//tr[2]//td[1]//input")).click();
		driver.findElement(By.xpath("//table//tbody//tr[3]//td[1]//input")).click();
		driver.findElement(By.xpath("//table//tbody//tr[4]//td[1]//input")).click();
		driver.findElement(By.xpath("//table//tbody//tr[5]//td[1]//input")).click();
	}

}
