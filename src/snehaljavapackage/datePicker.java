package snehaljavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","E:\\Training Materials\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='jQuery UI']")).click();

	}

}
