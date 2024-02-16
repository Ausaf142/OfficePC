package dekho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_browser {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
}
}
