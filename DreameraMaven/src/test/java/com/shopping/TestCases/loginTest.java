package com.shopping.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.config.TestBase.TestBase;
import com.eshoping.pages.Homepage;
import com.eshoping.pages.Loginpage;

public class loginTest extends TestBase
{
	Loginpage loginp;
	Homepage home;
	
	public loginTest()
	{
		super();
	}
	@BeforeMethod 
	void setup()
	{
		initialization();
		home=new Homepage();
		 loginp=new Loginpage();
	}
	@Test 
	void varifyvalidlogin()
	{
		loginp=home.clickonlogin();
		//loginp.login("ppprrftkar@gmail.com","123");
		Assert.assertEquals("https://automationexercise.com/","https://automationexercise.com/");
		loginp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
}
