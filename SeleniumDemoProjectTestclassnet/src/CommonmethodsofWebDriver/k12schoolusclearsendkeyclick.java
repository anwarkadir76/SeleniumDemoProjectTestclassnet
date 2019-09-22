package CommonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class k12schoolusclearsendkeyclick {

	public static void main(String[] args) {

	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.k12school.us/");

	    WebElement search_text = driver.findElement(By.id("loginlabel"));
	    WebElement search_button = driver.findElement(By.id("kadeer"));

	    search_text.sendKeys("Advance Java Programming");
	    search_text.clear();
	    search_text.sendKeys("Advance Java Programming");
	    search_button.click();

	    driver.quit();
	  }
	}