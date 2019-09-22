package Controlbrowsertogobackwardsandforward;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ITLEARN360BrowserGobackAndForwards {


public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();


    driver.get("https://www.itlearn360.com/");
    System.out.printf("now accesss %s \n", driver.getCurrentUrl());
    Thread.sleep(2000);

    driver.findElement(By.linkText("Free Courses")).click();
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