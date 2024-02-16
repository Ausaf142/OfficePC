package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {
public static WebDriver driver;
	
@Parameters("browser")
@BeforeMethod

public void launch(String browser) {
switch (browser.toLowerCase()) {
case "chrome":
driver = new ChromeDriver();
break;

case "edge":
driver =new EdgeDriver();
break;

default:
throw new IllegalArgumentException("Invalid browser parameter: " + browser);

			}
		}
}
		

