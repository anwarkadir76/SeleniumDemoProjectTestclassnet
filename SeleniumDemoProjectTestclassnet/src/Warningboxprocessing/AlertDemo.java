package Warningboxprocessing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.baidu.com");

	    driver.findElement(By.linkText("Setting")).click();
	    driver.findElement(By.linkText("Search Setting")).click();
	    Thread.sleep(2000);

	   
	    driver.findElement(By.className("prefpanelgo")).click();


	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);

	    driver.quit();
	  }
	}