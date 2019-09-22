package CommonmethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class itlear360Getsizegettextgetattribute {

	 public static void main(String[] args) {

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.itlearn360.com/");

		  
		    WebElement size = driver.findElement(By.id("kw"));
		    System.out.println(size.getSize());

		   
		    WebElement text = driver.findElement(By.id("cp"));
		    System.out.println(text.getText());

		    
		    WebElement ty = driver.findElement(By.id("kw"));
		    System.out.println(ty.getAttribute("type"));

		
		    WebElement display = driver.findElement(By.id("kw"));
		    System.out.println(display.isDisplayed());

		    driver.quit();
		  }
		}