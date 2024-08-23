package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelProperty {
@Test
public void data() throws EncryptedDocumentException, IOException {

	FileInputStream fis = new FileInputStream("./FKM_Credentials.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1") ;

	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	Row row1 = sheet.getRow(1);
	Cell cell1 = row.getCell(1);
	double username = cell.getNumericCellValue();  //double me ayega numeric value
	long UNLong =(long)username;
	String USER=String.valueOf(UNLong);
	System.out.println(USER);
	double password = cell1.getNumericCellValue();  //double me ayega numeric value
	long pass =(long)password;
	String pwd=String.valueOf(pass);
	System.out.println(pwd);
	
/*To write in the same sheet ,the below code is for that*/

//  If u use createRow then it will create new one and remove the previous data.
//	Row writeRow = sheet.getRow(0);
//	Cell writeCell = writeRow.createCell(2);
//	writeCell.setCellValue("ausaf");
//	FileOutputStream fileOutputStream = new FileOutputStream("./FKM_Credentials.xlsx");
//	wb.write(fileOutputStream);
	
}
}
