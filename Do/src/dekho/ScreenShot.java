package dekho;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File pic = ts.getScreenshotAs(OutputType.FILE);
		File file =new File("./AdeebSS.png");
		File pic2 = driver.findElement(By.xpath("//button[text()='Try it']")).getScreenshotAs(OutputType.FILE);
		
		Files.copy(pic, file);
		File file2 =new File("./AusaaafSS.png");
		Files.copy(pic2, file2);
		driver.close();
		
}
}