package snehaljavapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Clickmethod {

	
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		
		String domain = (String)javascript.executeScript("return document.domain");
		
		System.out.println(domain);
		
		
		
		
	}
	
	
}
