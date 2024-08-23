package FKM;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class Report_Missing extends Base_class {
@Test
public void Report_form() throws InterruptedException, java.text.ParseException, IOException {

	Thread.sleep(5000);
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fkm-newheader-menuButton"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Cashback summary']"))).click();

	WebElement reportForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Promo code']")));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", reportForm);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3[text()='Report Missing'])[1]"))).click();
//	driver.findElement(By.id("select_store")).click();
	WebElement dropdownList = driver.findElement(By.id("select_store"));
	
	Select sel = new Select(dropdownList);
	Thread.sleep(1000);
	sel.selectByIndex(1);
 
	WebElement ClickList = driver.findElement(By.id("select_click_store"));
	Select sel2 = new Select(ClickList);
	List<WebElement> ClickDates = sel2.getOptions();
	int length = ClickDates.size();
    sel2.selectByIndex(1);
   
    List<String> elementTexts = new ArrayList<>();

    // Loop through the elements and add their text to the ArrayList
    for (WebElement element : ClickDates) {
        elementTexts.add(element.getText());
    }

    // Example: Retrieve and print the text of the first and second elements
    System.out.println("First element text: " + elementTexts.get(1));
    String ClickedDate = elementTexts.get(1);

	Thread.sleep(1000);
	sel2.selectByIndex(1);
	driver.findElement(By.id("your_name")).sendKeys("Tester");
	driver.findElement(By.id("product_purchased")).sendKeys("TESTING");
	driver.findElement(By.id("date_of_transaction")).sendKeys(DateFormatter(ClickedDate));
	int num = Keys();
	driver.findElement(By.id("order_id")).sendKeys("TEST007"+num+"");   
	driver.findElement(By.id("order_amount")).sendKeys("786");
	
	 WebElement uploadBtn = driver.findElement(By.xpath("//label[ text()='Upload screenshot of your invoice*']"));	
	 js.executeScript("arguments[0].scrollIntoView(true);", uploadBtn);

	 Thread.sleep(2000);
	 uploadBtn.click();
	
	Runtime.getRuntime().exec("./ClaimFormImg.exe");
	Thread.sleep(5000); 

	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

}
    public static String DateFormatter(String originalDateStr) throws java.text.ParseException  {
//        String originalDateStr = "2024-07-08 15:00:01";
        SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat targetFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        Date date = originalFormat.parse(originalDateStr);
		String formattedDateStr = targetFormat.format(date);
		System.out.println(formattedDateStr); // Output: 08-07-2024
		return  formattedDateStr;
    }
    public static int Keys() {
    	Random rand = new Random();
    	int Rkey=rand.nextInt(100);
    	return Rkey;
    }
}
