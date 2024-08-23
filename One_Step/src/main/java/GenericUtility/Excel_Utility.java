package GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value;

public class Excel_Utility {
public String excelData(String path,String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(file);
	Sheet sh = wb.getSheet(sheet);
	Row rw = sh.getRow(row);
	Cell cel = rw.getCell(cell);
	String data = cel.getStringCellValue();
	return data;
}
public String excelNumericData(String path,String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(file);
	Sheet sh = wb.getSheet(sheet);
	Row rw = sh.getRow(row);
	Cell cel = rw.getCell(cell);
	double data = cel.getNumericCellValue();
	long UNLong =(long)data;
	
	String Ndata = String.valueOf(UNLong);
	return Ndata;

}
public void excelWriteData(String path,String sheet,int row,int cellCreated,String text) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(file);
	Sheet sh = wb.getSheet(sheet);
	Row rw = sh.getRow(row);
	rw.createCell(cellCreated).setCellValue(text);;
	FileOutputStream fos =new FileOutputStream(path);
	wb.write(fos);
	fos.close();
	
	
}
}
