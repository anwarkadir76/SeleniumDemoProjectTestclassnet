package Controlbrowsertogobackwardsandforward;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class K12SCHOOLUSBrowserGobackAndForwards {

	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();
    driver.get("http://www.k12school.us/");
	    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);

	    
	    driver.findElement(By.linkText("Courses")).click();
	    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);


	    driver.navigate().back();
	    System.out.printf("back to %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);

	
	    driver.navigate().forward();
	    System.out.printf("forward to %s \n", driver.getCurrentUrl());
	    Thread.sleep(2000);
	    driver.navigate().refresh();// refresh a page 
	    
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	  }
	}