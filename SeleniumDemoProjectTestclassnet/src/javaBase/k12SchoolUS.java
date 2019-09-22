package javaBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k12SchoolUS {

	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.k12school.us/");

	        String title = driver.getTitle();
	        System.out.printf(title);

	        driver.close();
	    }
	}