package seleniumexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookxlsx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\gourish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
				String filePath="C:\\gourish\\xlfiles";
				String fileName="TestData1.xlsx";
				String sheetName="Sheet1";
			    File file = new File(filePath+"\\"+fileName);
			    FileInputStream inputStream = new FileInputStream(file);
			    Workbook workBook = null;
			    String fileExtensionName = fileName.substring(fileName.indexOf("."));
			    if(fileExtensionName.equals(".xlsx")){

			    	workBook = new XSSFWorkbook(inputStream);
			    }
			    else if(fileExtensionName.equals(".xls")){
			    	workBook = new XSSFWorkbook(inputStream);
			    }			    
				org.apache.poi.ss.usermodel.Sheet sheet =workBook.getSheet(sheetName);
	            Row row = (sheet).getRow(1);
	            driver.navigate().refresh();
	    		driver.findElement(By.xpath("//form//input[@name='email']")).sendKeys(row.getCell(0).getStringCellValue());
	    		driver.findElement(By.xpath("//form//input[@name='pass']")).sendKeys(row.getCell(1).getStringCellValue());
	    		driver.findElement(By.xpath("//form//button")).click();
			        
			    } 

}
