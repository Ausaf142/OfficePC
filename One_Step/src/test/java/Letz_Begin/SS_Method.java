package Letz_Begin;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SS_Method {
public static void main(String[] args) throws IOException {
	Random num = new Random();
	int key = num.nextInt(100);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
	WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Tuesday 28 ')]"));
	File src = ele.getScreenshotAs(OutputType.FILE);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File file =new File("./adee"+key+".png");
//	File src = ts.getScreenshotAs(OutputType.FILE);
	Files.copy(src, file);
}
}
