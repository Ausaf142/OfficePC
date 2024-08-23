package FirstPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.Excel_Utility;

public class CadburyDemo  {
@Test
	public void CadData() throws EncryptedDocumentException, IOException, InterruptedException {
	Excel_Utility excel= new Excel_Utility();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://cadburygifting.in/track-my-order/");
		for(int i=0;i<3;i++) {
			System.out.println(i);
			int j=0;
			String id = excel.excelNumericData("./CADDEMO.xlsx", "Sheet1", i, j);
			driver.findElement(By.id("trackOderId")).sendKeys("00"+id);
			j=i+1;
			String email = excel.excelData("./CADDEMO.xlsx", "Sheet1", i, j);
			driver.findElement(By.id("email")).sendKeys(email);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Track Order']")).click();
			Thread.sleep(4000);
			int writeCell=i+2;
			String status = driver.findElement(By.xpath("(//div[@class='right']/.)[1]")).getText();
			excel.excelWriteData("./CADDEMO.xlsx", "Sheet1", i,writeCell,status );
			Thread.sleep(1000);
			driver.navigate().refresh();
//			System.out.println(i);
//			System.out.println(j);
		
		}
		
		System.out.println("terminate");
	}
}
