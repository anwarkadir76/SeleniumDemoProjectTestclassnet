package Controlbrowseroperation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Controlbrowserwindowsize {

	  public static void main(String[] args) throws InterruptedException {

		    WebDriver driver= new ChromeDriver();
		    driver.get("https://www.baidu.cn");

		    driver.manage().window().maximize();
		    Thread.sleep(2000);

		    driver.get("https://m.baidu.cn");
		    driver.manage().window().setSize(new Dimension(480, 800));
		    Thread.sleep(2000);

		    driver.quit();
		  }
		}