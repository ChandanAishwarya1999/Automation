package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileLib1 {

	private static final int HDFC = 0;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FIleLib f = new FIleLib();
//		WebDriver driver=new ChromeDriver();
//		String url = f.readDataFromPropery("url");
//		driver.get(url);
//		String un = f.readDataFromPropery("username");
//		driver.findElement(By.id("username")).sendKeys(un);
//		String pwd = f.readDataFromPropery("password");
//		driver.findElement(By.name("pwd")).sendKeys(pwd);
		
		//String data = f.readDataFromExcel("createcustomer",1, 2);
		//System.out.println(data);
		
		  f.writeDataFromExcel("createcustomer", 1, 2,"HDFC-101");
	}
}