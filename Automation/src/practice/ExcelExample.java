package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelExample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver Driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis); 
		String data = wb.getSheet("createcustomer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	}

}
