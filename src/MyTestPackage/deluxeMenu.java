package MyTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;


public class deluxeMenu {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://deluxe-menu.com/popup-mode-sample.html");

		WebElement img = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));

	Actions action = new Actions(driver);
	action.contextClick(img).build().perform();

	action.moveToElement(driver.findElement(By.xpath("//td[@id='dm2m1i1tdT']"))).build().perform();


	action.moveToElement(driver.findElement(By.xpath("//td[@id='dm2m2i1tdT']"))).build().perform();
	driver.findElement(By.xpath("//td[@id='dm2m3i1tdT']")).click();

		
















	}

}
