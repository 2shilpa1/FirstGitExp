package MyTestPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class myTestAmazonClass {
	public static void main(String[] args) {
		
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Actions actions = new Actions(driver);
	WebElement main_menu = driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));
	WebElement sub_menu = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span"));
	actions.moveToElement(main_menu).build().perform();
    sub_menu.click();

}
}