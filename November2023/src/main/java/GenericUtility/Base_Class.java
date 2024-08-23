package GenericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
public static WebDriver driver; 
public  WebDriver edriver =null;

//@BeforeMethod
//public void BM() {
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	driver.get("http://localhost:8888/");
//	 edriver = driver;
//}
/*Humlog ka Apna Program hai*/

@Parameters("BROWSER")
@BeforeMethod
public void BM(String BROWSER) {
	if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else {
		System.out.println("error found");
	}
}

}
