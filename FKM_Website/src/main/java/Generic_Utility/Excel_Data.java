package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Data {
	
public String getStringData(String path,String sheet,int row,int col) throws EncryptedDocumentException, IOException {
   
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh =wb.getSheet(sheet);
	Row ro = sh.getRow(row);
	Cell cell = ro.getCell(col);
	String data = cell.getStringCellValue();
	return data;
}

public String getNumericData(String path,String sheet,int row,int col) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh =wb.getSheet(sheet);
	Row ro = sh.getRow(row);
	Cell cell = ro.getCell(col);
	double numericdata = cell.getNumericCellValue();
	long longData=(long)numericdata;
	String stringData=String.valueOf(longData);
	return stringData;
}
public void writeData(String path,String sheet,int row,int col,String Value) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh =wb.getSheet(sheet);
	Row ro = sh.getRow(row);
	Cell cell = ro.createCell(col);
	cell.setCellValue(Value);
	FileOutputStream fileOutputStream = new FileOutputStream(path);
	wb.write(fileOutputStream);
	
}
 






}
