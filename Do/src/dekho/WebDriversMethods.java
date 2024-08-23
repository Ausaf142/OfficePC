package dekho;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*get
 *close
 *quit
 *manage
 *navigate
 *getcurrenturl
 *getpagesoursce
 *getwindowhandle
 *getwindowhandles
 *gettitle
 *switchto */

public class WebDriversMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.id("email")).sendKeys("anaadimika@gmail.com");
		
		
	}
}

