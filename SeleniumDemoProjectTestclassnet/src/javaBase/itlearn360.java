package javaBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class itlearn360 {

	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.itlearn360.com/");

	        String title = driver.getTitle();
	        System.out.printf(title);

	        driver.close();
	    }
	}