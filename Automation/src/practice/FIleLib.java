package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.sdk.metrics.data.Data;

public class FIleLib {
	public String readDataFromPropery(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");	 
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
		
	}
	public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");	
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public void writeDataFromExcel(String sheetname,int row, int cell,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb1=WorkbookFactory.create(fis);
		wb1.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb1.write(fos);
	}
}