package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multipledata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count = wb.getSheet("admin").getLastRowNum();
		for (int i = 0; i <count; i++) {
			String Username = wb.getSheet("admin").getRow(i).getCell(0).getStringCellValue();
			System.out.print(Username);
			String Password = wb.getSheet("admin").getRow(i).getCell(1).getStringCellValue();
			System.out.println(Password);
		}
		
	}

}
