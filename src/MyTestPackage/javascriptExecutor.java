package MyTestPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class javascriptExecutor {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		//How to execute javascript through selenium
		
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		System.out.println(javascript.executeScript("return document.title"));

	}

}
