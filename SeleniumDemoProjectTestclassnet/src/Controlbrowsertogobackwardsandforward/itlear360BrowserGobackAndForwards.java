package Controlbrowsertogobackwardsandforward;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class itlear360BrowserGobackAndForwards {

	 public static void main(String[] args) throws InterruptedException {

		    WebDriver driver = new ChromeDriver();

		 
		    driver.get("https://www.itlearn360.com/");
		    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
		    Thread.sleep(2000);

		   
		    driver.findElement(By.linkText("Log in")).click();
		  
		    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
		    Thread.sleep(2000);

		
		    driver.navigate().back();
		    System.out.printf("back to %s \n", driver.getCurrentUrl());
		    Thread.sleep(2000);

		 
		    driver.navigate().forward();
		    System.out.printf("forward to %s \n", driver.getCurrentUrl());
		    Thread.sleep(2000);

		    driver.quit();
		  }
		}