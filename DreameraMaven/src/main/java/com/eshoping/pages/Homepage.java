package com.eshoping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.TestBase.TestBase;

public class Homepage extends TestBase
{
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement products;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement cart;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	WebElement login;
	
	@FindBy(xpath="//h2[contains(text(),'Category')]")
	WebElement cate;
	
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonhomelink()
	{
		home.click();
	}
	public String verifytitle()
	{
		String  title=driver.getTitle();
	     return title;	
	}
	public boolean verifyhomepage()
	{
		boolean catedis=cate.isDisplayed();
		return catedis;
		
	}
	 public Loginpage clickonlogin()
	 {
		 login.click();
		 return new Loginpage();
		 
	 }
}
