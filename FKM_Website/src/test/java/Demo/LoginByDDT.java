package Demo;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Generic_Utility.Excel_Data;

public class LoginByDDT {
@Test
public void log() throws EncryptedDocumentException, IOException{
	Excel_Data ex = new Excel_Data();
	String Id = ex.getNumericData("./FKM_Credentials.xlsx", "Sheet1", 1, 0);
	String pwd = ex.getNumericData("./FKM_Credentials.xlsx", "Sheet1", 1, 1);
	System.out.println(Id);
	System.out.println(pwd);
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 driver.get("https://desktop.freekaamaal.com/");
 	 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
 	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='d_flex']"))).click();
 	 wait.until(ExpectedConditions.elementToBeClickable(By.id("number"))).sendKeys(Id);
 	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get OTP']"))).click();
 	 int[] numbers = new int[6]; 
 	 for (int i = 0; i < pwd.length(); i++) {
 		numbers[i] = Character.getNumericValue(pwd.charAt(i));
 		
     }
 	  for (int i = 0; i < numbers.length; i++) {
          System.out.println("Digit at index " + i + ": " + numbers[i]);
      }
 	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@inputmode='numeric'])[1]")));
 	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[1]")).sendKeys(""+numbers[0]+"");
 	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[2]")).sendKeys(""+numbers[1]+"");
 	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[3]")).sendKeys(""+numbers[2]+"");
 	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[4]")).sendKeys(""+numbers[3]+"");
 	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[5]")).sendKeys(""+numbers[4]+"");
 	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[6]")).sendKeys(""+numbers[5]+"");
 	 driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	
	}
}
