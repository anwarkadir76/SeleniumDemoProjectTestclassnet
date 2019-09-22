package Positionagroupofelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ElementsDemo {

	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.baidu.com/");

	    WebElement search_text = driver.findElement(By.id("kw"));
	    search_text.sendKeys("selenium");
	    search_text.submit();
	    Thread.sleep(2000);

	
	    List<WebElement> search_result = driver.findElements(By.xpath("//div/div/h3"));


	    System.out.println(search_result.size());

	
	    for(WebElement result : search_result){
	        System.out.println(result.getText());
	    }

	    System.out.println("-------I Know software Testing---------");

	  
	    WebElement text = search_result.get(search_result.size() - 10);
	    System.out.println(text.getText());

	    driver.quit();
	  }
	}