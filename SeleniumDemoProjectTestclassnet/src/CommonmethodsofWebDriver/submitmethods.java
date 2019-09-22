package CommonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitmethods {

	 public static void main(String[] args) {

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.baidu.com/");

		    WebElement search_text = driver.findElement(By.id("kw"));
		    search_text.sendKeys("Selenium");
		    search_text.submit();
		    driver.quit();
		  }
		}