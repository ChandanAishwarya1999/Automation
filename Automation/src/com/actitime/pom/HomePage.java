package com.actitime.pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement lgt; 
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
public void logout() {
	lgt.click();
	
	
}
}
