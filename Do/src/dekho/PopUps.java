package dekho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*First two Category of popup is Window Base and browser based pop up*/
/*Browser popup is ----Alert/Confirmation/Prompt*/


public class PopUps {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[contains(text(),'    click the button')]")).click();
	driver.switchTo().alert().dismiss();
	System.out.println("done");
	driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
	driver.switchTo().alert().dismiss();
	System.out.println("confirmation done");
	driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
	driver.switchTo().alert().accept();
	System.out.println("Prompt done");
}
}
