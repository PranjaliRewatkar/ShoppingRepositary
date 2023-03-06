package com.config.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
public static WebDriver driver;
public static Properties prop;
 
public TestBase() 
{
 prop= new Properties();
  
 FileInputStream fis;
 {
	 try {
	fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\dreamera\\DreameraMaven\\src\\main\\java\\com\\eshoping\\config\\config.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e)
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	 
 }
 }
  public void initialization()
  {
	  String browsername=prop.getProperty("browser");
	  if(browsername.equals("Chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else
	  {
		  driver=new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://automationexercise.com/");
	  
  }
 
}

