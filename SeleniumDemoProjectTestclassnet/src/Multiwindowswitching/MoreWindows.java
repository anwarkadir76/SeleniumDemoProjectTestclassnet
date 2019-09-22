package Multiwindowswitching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreWindows {

	 public static void main(String[] arge) throws InterruptedException{

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.baidu.com");


		    String search_handle = driver.getWindowHandle();

	
		    driver.findElement(By.linkText("LOGIN")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("RAGISTRATION")).click();

		 
		    Set<String> handles = driver.getWindowHandles();

		  
		    for(String handle : handles){
		      if (handle.equals(search_handle)==false){
		        
		        driver.switchTo().window(handle);
		        System.out.println("now register window!");
		        Thread.sleep(2000);
		        driver.findElement(By.name("userName")).clear();
		        driver.findElement(By.name("userName")).sendKeys("user name");
		        driver.findElement(By.name("phone")).clear();
		        driver.findElement(By.name("phone")).sendKeys("phone number");
		        //......
		        Thread.sleep(2000);
		
		        driver.close();
		      }
		    }
		    Thread.sleep(2000);

		    driver.quit();
		  }
		}