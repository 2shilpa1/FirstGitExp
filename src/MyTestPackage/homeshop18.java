package MyTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class homeshop18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.homeshop18.com/");
		
		WebElement main_menu = driver.findElement(By.xpath("//*[@id='CategoryMenu1']/a"));
		WebElement sub_menu = driver.findElement(By.xpath("//*[@id='CategoryMenu1']/ul/li[2]/ul[1]/li[4]/a"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(main_menu).build().perform();
		
		Thread.sleep(2000);
		
		sub_menu.click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
