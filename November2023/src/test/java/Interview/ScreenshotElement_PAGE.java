package Interview;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class ScreenshotElement_PAGE {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File Pic = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("./IntroSS1.png");
	FileUtils.copyFile(Pic, f);
	File pic2 = driver.findElement(By.id("iframe1")).getScreenshotAs(OutputType.FILE);
	File f1 = new File("./IntroSS2.png");
	FileUtils.copyFile(pic2, f1);
	
	
	
	
	
	
	
}
}
