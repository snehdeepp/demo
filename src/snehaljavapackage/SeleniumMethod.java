package snehaljavapackage;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","E:\\Automation Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		/*File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(screenshot,new File("D:\\screenshot.jpg"));
		
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		Alert alert1 =driver.switchTo().alert();
		
		alert1.accept();
		
		alert1.sendKeys("hi i am alert");
		
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}
		
}


