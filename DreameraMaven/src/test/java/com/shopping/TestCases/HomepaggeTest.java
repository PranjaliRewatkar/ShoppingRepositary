package com.shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.config.TestBase.TestBase;
import com.eshoping.pages.Homepage;

public class HomepaggeTest extends TestBase
{
	Homepage home;
	
	@BeforeMethod
	void setup()
	{
		initialization();
		home=new Homepage();
	}
	public HomepaggeTest()
	{
		super();
	}
	@Test (priority = 0)
	void  verifyPageTitle()
	{
		String title=home.verifytitle();
	    Assert.assertEquals(title,"Automation Exercise");	
	}
	 @Test (priority = 1)
	 void verifyhomePagelanding()
	 {
		 boolean elementvisible=home.verifyhomepage();
		 Assert.assertEquals(true, elementvisible);
		 
	 }
	
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
	}

