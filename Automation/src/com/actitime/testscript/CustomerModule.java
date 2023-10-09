package com.actitime.testscript;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void createCustomer() {
		Assert.fail();
		Reporter.log("createCustomer",true);

	}
		@Test(dependsOnMethods = "createCustomer")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);

	}
	@Test
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);

	}
	}


