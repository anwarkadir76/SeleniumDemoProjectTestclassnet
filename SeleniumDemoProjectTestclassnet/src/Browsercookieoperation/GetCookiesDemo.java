package Browsercookieoperation;



import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookiesDemo {

	public static void main(String[] args){
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.baidu.com");

	    Cookie c1 = new Cookie("name", "key-aaaaaaa");
	    Cookie c2 = new Cookie("value", "value-bbbbbb");
	    driver.manage().addCookie(c1);
	    driver.manage().addCookie(c2);

	
	    Set<Cookie> coo = driver.manage().getCookies();
	    System.out.println(coo);


	    //driver.manage().deleteAllCookies();

	    driver.quit();
	  }
	}
