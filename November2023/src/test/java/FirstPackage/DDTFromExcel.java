package FirstPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.Base;
import GenericUtility.Base_Class;

public class DDTFromExcel extends Base_Class{
	@Test 
	public void DDT() throws EncryptedDocumentException, IOException  {
	     WebDriver driver =new ChromeDriver() ;     
//	     driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     File file =new File("./CashoraExcel.xlsx");
	     Workbook wb = WorkbookFactory.create(file);
	     Sheet sheet = wb.getSheet("Sheet1");
	     Row row = sheet.getRow(0);
	     Row row2 = sheet.getRow(1);
	     Row row3 = sheet.getRow(2);
	     Cell cell = row.getCell(1);
	     Cell cell2 = row2.getCell(1);
	     Cell cell3 = row3.getCell(1);
	     String url = cell.getStringCellValue();
	     double value = cell2.getNumericCellValue();
	     long UNLong =(long)value;
	     String USER=String.valueOf(UNLong);//----convert long value into string
	     
	     
	     String pw = cell3.getStringCellValue();
	     driver.get(url);
	     driver.findElement(By.className("already-user")).click();
	     System.out.println(UNLong);
	     driver.findElement(By.id("login_mobile")).sendKeys(USER);
	     driver.findElement(By.id("login_password")).sendKeys(pw);
	     driver.findElement(By.className("loginbtn")).click();
	     
	     
	     
}
}
