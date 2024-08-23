package Fkm_WEB_Chrome;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class Deal_Story extends Base_Class {
	@Test(retryAnalyzer = Try.class)
    public void story() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement story = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='dealstories-card'])[1]")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='dealstories-card'])[1]")).click();
        
//        driver.findElement(By.xpath("//div[@class=\"webstories_details_container\"]"));
//        WebElement viewDetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='webstories_details__ab_click-1'])[2]")));
 
        List<WebElement> images = driver.findElements(By.xpath("//div[@class='webstories_details_indicator_header']"));
        System.out.println(images);
        int count = images.size();
        System.out.println("Number of images: " + count);
//        WebElement viewDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='webstories_details__ab_click-1'])[2]")));
        try {
        	 for (int i = 0; i < count; i++) {
                 // Locate the image to click on
//                 WebElement image = images.get(i);
        		 WebElement viewDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='webstories_details__ab_click-1'])[2]")));
        		 viewDetails.click();
        		 
        		 
                 // Click the image
//                 image.click();
//                 System.out.println("Clicked image " + (i + 1));

                 // Perform some action on the clicked image
                 // For example, wait for a new screen or modal to appear, then navigate back
                 // driver.navigate().back(); // Navigate back if a new screen is opened

                 // Swipe to the next image if not the last one
              
             }
        	
        }

        catch(Exception e){
        	System.out.println(e.getMessage());
        	
             }
}

}

