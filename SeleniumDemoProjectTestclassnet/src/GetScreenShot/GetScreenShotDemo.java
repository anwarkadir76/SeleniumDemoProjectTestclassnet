package GetScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShotDemo {

	public static void main(String[] arge){

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.baidu.com");

	    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	      FileUtils.copyFile(srcFile,new File("d:\\screenshot.png"));
	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	    driver.quit();
	  }
	}