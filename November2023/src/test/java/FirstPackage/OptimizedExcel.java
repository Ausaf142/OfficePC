package FirstPackage;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import GenericUtility.Base_Class;
import GenericUtility.Excel_Utility;

public class OptimizedExcel extends Base_Class{
	@Test
	public void VtigerLogin() throws EncryptedDocumentException, IOException {
	Excel_Utility elib = new Excel_Utility();
	String user = elib.excelData("./Book1.xlsx", "Sheet1", 0, 0);
	String password = elib.excelData("./Book1.xlsx", "Sheet1", 0, 0);
	System.out.println(user);
	System.out.println(password);
	driver.findElement(By.name("user_name")).sendKeys(user);
	driver.findElement(By.name("user_password")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();
     
}
}
