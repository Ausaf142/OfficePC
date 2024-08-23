package dekho;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://resume.naukri.com/cv-submission");
		driver.findElement(By.xpath("//span[contains(text(),'Upload your latest Resume')]")).click();
		Runtime.getRuntime().exec("./a.exe");
	
}
}