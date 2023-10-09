package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		//Chrome Browser
		driver.manage().window().maximize();
		// Maximising the webPage
		driver.get("https://www.google.com/");
		// Trigerin The Url.
		TakesScreenshot ts=(TakesScreenshot) driver;
		// TakeScreenShot is method 
		// ts is reference Name
		//Here Taking ScreeShot by Using Takescreenshot Method 
		//and this method is Abstract method so we cant create an object
		//so that here we are taking reference of Chrome Browser (driver) this diver will take
		//takeScreenshor as parameter.
		File src = ts.getScreenshotAs(OutputType.FILE);
		// ts is reference Name by using reference name we use getscreenshotas method and it is parameter
		//inside i have to pass Outputtype, inside opp it has 3  methods
		// here i have to select file bcz the picture will display in the form of file
		File dest=new File("./screenshot/s.png");
		// here i have to use destination Place
		FileUtils.copyFile(src, dest);
		// i have to pass both from Place an destination Place
		System.out.println(src);
		//prnt stmt
		//Thread.sleep(60000);
	}
}
