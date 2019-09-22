package MouseActionChains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class itlern360maouseActionChains {

	 public static void main(String[] args) {

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.itlearn360.com/");

		    WebElement search_setting = driver.findElement(By.linkText("All Course"));
		    Actions action = new Actions(driver);
		    action.clickAndHold(search_setting).perform();
		 

		
		 action.contextClick(driver.findElement(By.id("element"))).perform();

		
		 action.doubleClick(driver.findElement(By.id("element"))).perform();


		 WebElement source = driver.findElement(By.name("element"));
		 WebElement target = driver.findElement(By.name("element"));
		 action.dragAndDrop(source,target).perform();

		
		 action.release().perform();
		    driver.quit();
		  }
		}