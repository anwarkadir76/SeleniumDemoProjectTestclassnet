package CommonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class itlear360clearsendkeyclick {

	 public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.itlearn360.com/");

		    WebElement search_text = driver.findElement(By.id("user_login"));
		    WebElement search_button = driver.findElement(By.id("kadeer"));

		    search_text.sendKeys("Java");
		    search_text.clear();
		    search_text.sendKeys("Selenium Training with Java");
		    search_button.click();

		    driver.quit();
		  }
		}
