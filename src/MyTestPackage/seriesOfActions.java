 package MyTestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class seriesOfActions {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		WebElement username = driver.findElement(By.name("userName"));
		
		Actions builder = new Actions(driver);
		
		Action seriesofaction = builder
				.click(username)
				.contextClick()
				.sendKeys(Keys.DOWN)
				.sendKeys(Keys.DOWN)
				.sendKeys(Keys.DOWN)
				.build();
		seriesofaction.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
