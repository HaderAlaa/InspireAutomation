package com.Inspire.base;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestBase 
{
	public static Properties prop;
    public static WebDriver driver;
	
		
    public static void  main(){
		//System.setProperty("webdriver.chrome.driver","..\\drivers\\chromedriver.exe");

    	
    }
	@BeforeSuite


	public static void intialization ()
	{
	
			System.setProperty("webdriver.chrome.driver",new File("drivers\\chromedriver.exe").getAbsolutePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://b2c-dev.inspiresys.com");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	
//	@AfterMethod
//	public void teardown() throws InterruptedException{
//		Thread.sleep(20000);
//		driver.quit();
//	}
	
}
