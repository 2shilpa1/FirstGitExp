package MyTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class testDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		/*WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));*/
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions action = new Actions(driver);
		
		//action.dragAndDrop(draggable, droppable).build().perform();
		action.dragAndDropBy(slider, 500, 0).build().perform();
	}

}
