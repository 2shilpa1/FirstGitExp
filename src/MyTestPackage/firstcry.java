package MyTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firstcry {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.firstcry.com/");
		
		Thread.sleep(5000);
		driver.switchTo().frame("iframe_Login");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("abc@gmail.com");
		
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
