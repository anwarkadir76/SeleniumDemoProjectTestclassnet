package CommonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSendkeyClickWebDriver {

	 public static void main(String[] args) {
package CommonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSendkeyClickWebDriver {

	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.baidu.com/");

		    WebElement search_text = driver.findElement(By.id("kw"));
		    WebElement search_button = driver.findElement(By.id("su"));

		    search_text.sendKeys("Java");
		    search_text.clear();
		    search_text.sendKeys("Selenium");
		    search_button.click();

		    driver.quit();
		  }
		}
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.baidu.com/");

		    WebElement search_text = driver.findElement(By.id("kw"));
		    WebElement search_button = driver.findElement(By.id("su"));

		    search_text.sendKeys("Java");
		    search_text.clear();
		    search_text.sendKeys("Selenium");
		    search_button.click();

		    driver.quit();
		  }
		}
