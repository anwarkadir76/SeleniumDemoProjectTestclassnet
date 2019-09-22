package FileUpload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver = new ChromeDriver();
	    File file = new File("./HTMLFile/upfile.html");
	    String filePath = file.getAbsolutePath();
	    driver.get(filePath);

	  
	    driver.findElement(By.name("file")).sendKeys("D:\\upload_file.txt");
	    Thread.sleep(5000);

	    driver.quit();
	  }
	}