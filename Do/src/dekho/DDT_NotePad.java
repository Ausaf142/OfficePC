package dekho;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_NotePad {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8888/");
	FileInputStream fis =new FileInputStream("./login.txt");
	Properties pro =new Properties();
	pro.load(fis);
	String USER = pro.getProperty("user");
	String PASS = pro.getProperty("pwd");
	driver.findElement(By.name("user_name")).sendKeys(USER);
	driver.findElement(By.name("user_password")).sendKeys(PASS);
	driver.findElement(By.id("submitButton")).click();
	
	
	
}
}
