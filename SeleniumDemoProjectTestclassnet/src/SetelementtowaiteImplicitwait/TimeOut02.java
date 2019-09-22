package SetelementtowaiteImplicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOut02 {

	 public static void main(String[] args){

		    WebDriver driver = new ChromeDriver();

		    
		    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		    driver.get("https://www.baidu.com/");

		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.id("kw")).sendKeys("selenium");

		 
		    driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);

		    driver.quit();
		  }
		}