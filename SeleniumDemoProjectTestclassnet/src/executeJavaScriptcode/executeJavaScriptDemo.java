package executeJavaScriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeJavaScriptDemo {

	public static void main(String[] args) throws InterruptedException{

	    WebDriver driver = new ChromeDriver();


	    driver.manage().window().setSize(new Dimension(700, 600));
	    driver.get("https://www.baidu.com");

	 
	    driver.findElement(By.id("kw")).sendKeys("webdriver api");
	    driver.findElement(By.id("su")).click();
	    Thread.sleep(2000);

	
	    ((JavascriptExecutor)driver).executeScript("window.scrollTo(100,450);");
	    Thread.sleep(3000);

	    driver.quit();
	  }
	}
