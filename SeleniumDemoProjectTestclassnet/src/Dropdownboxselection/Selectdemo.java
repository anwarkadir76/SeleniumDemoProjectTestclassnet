package Dropdownboxselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdemo {

	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.baidu.com");

	    driver.findElement(By.linkText("Setting")).click();
	    driver.findElement(By.linkText("Search Setting")).click();
	    Thread.sleep(2000);

	  
	    WebElement el = driver.findElement(By.xpath("//select"));
	    Select sel = new Select(el);
	    sel.selectByValue("20");
	    Thread.sleep(2000);

	    driver.quit();
	  }
	}