package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(2000);
		Set<String> handle = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		System.out.println(handle);
		for (String string : handle) {
			driver.switchTo().window(string);{
				if(parent.equals(string)){
					//driver.close();
					}
				else {
					driver.close();
					
				}
			}
			
			//driver.close();
		}
	}

}
