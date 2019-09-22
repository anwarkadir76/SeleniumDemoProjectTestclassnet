package MouseActionChains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

	 public static void main(String[] args) {

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.baidu.com/");

		    WebElement search_setting = driver.findElement(By.linkText("Setting"));
		    Actions action = new Actions(driver);
		    action.clickAndHold(search_setting).perform();

		    driver.quit();
		  }
		}