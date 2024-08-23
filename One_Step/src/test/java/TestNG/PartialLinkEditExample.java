package TestNG;



import java.io.File;
import java.io.FileInputStream;
	import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.Excel_Utility;


	public class PartialLinkEditExample {
		String old ="https://images.freekaamaal.com/";
		String n ="https://abc-1ffdb.kxcdn.com//";
		@Test
		public void ptt() throws EncryptedDocumentException, IOException {
//			 WebDriver driver =new ChromeDriver() ;     
//		     driver.manage().window().maximize();
//		     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//		     File file =new File("./Book1.xlsx");
//		     Workbook wb = WorkbookFactory.create(file);
//		     Sheet sheet = wb.getSheet("Sheet1");
//		     Row row = sheet.getRow(0);
//		     Cell cell = row.getCell(0);
//		     String url = cell.getStringCellValue();
//		     String newURL = url.replace(old, n);
//		     System.out.println(newURL);
		     
		     for(int i=0;i<3;i++) {
					System.out.println(i);
					int j=0;
					 File file =new File("./Book1.xlsx");
				     Workbook wb = WorkbookFactory.create(file);
				     Sheet sheet = wb.getSheet("Sheet1");
				     Row row = sheet.getRow(i);
				     Cell cell = row.getCell(j);
				     String url = cell.getStringCellValue();
				     String newURL = url.replace(old, n);
				     System.out.println(newURL);
				     Excel_Utility excel = new Excel_Utility();
				   
				     j++;
				     excel.excelWriteData("./Book1.xlsx", "Sheet1", i, j, newURL);
					
		     }
					
//					String id = excel.excelNumericData("./CADDEMO.xlsx", "Sheet1", i, j);
//					driver.findElement(By.id("trackOderId")).sendKeys("00"+id);
//					j=i+1;
//					String email = excel.excelData("./CADDEMO.xlsx", "Sheet1", i, j);
//					driver.findElement(By.id("email")).sendKeys(email);
//					Thread.sleep(1000);
//					driver.findElement(By.xpath("//button[text()='Track Order']")).click();
//					Thread.sleep(4000);
//					int writeCell=i+2;
//					String status = driver.findElement(By.xpath("(//div[@class='right']/.)[1]")).getText();
//					excel.excelWriteData("./CADDEMO.xlsx", "Sheet1", i,writeCell,status );
//					Thread.sleep(1000);
//					driver.navigate().refresh();
////					System.out.println(i);
////					System.out.println(j);
////				}
		     
		     
		}
	  
	    
	

}
