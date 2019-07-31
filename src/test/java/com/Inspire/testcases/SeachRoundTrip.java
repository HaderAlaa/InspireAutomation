package com.Inspire.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Inspire.base.TestBase;
import com.Inspire.data.ExcelUtils;
import com.Inspire.pages.SearchForTrip;


public class SeachRoundTrip extends TestBase{
	  
	SearchForTrip RoundTrip;
	ExcelUtils data;
	

	public SeachRoundTrip() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setup() throws IOException
	{
	
		RoundTrip = new SearchForTrip(driver);
		data=new ExcelUtils();
	
		}
	

	@Test
	
		public void searchRoundtrip() throws InterruptedException
		{

		
		String dep= data.getCellDataValue(1, 0);  //CAI
		String dep1=Character.toString(dep.charAt(0)); //C
		String dep2=Character.toString(dep.charAt(1));  //A
		String dep3=Character.toString(dep.charAt(2));   //I
		RoundTrip.SetDeparDestLoc(RoundTrip.Txt_DepartureLocation , dep1);
		RoundTrip.SetDeparDestLoc(RoundTrip.Txt_DepartureLocation , dep2);
		RoundTrip.SetDeparDestLoc(RoundTrip.Txt_DepartureLocation , dep3);
		Thread.sleep(1000);
		RoundTrip.selectLocation();
		Thread.sleep(500);
	//------------------------------------------------------
		
		String des= data.getCellDataValue(1, 1);
		String des1=Character.toString(des.charAt(0)); //J
		String des2=Character.toString(des.charAt(1));  //E
		String des3=Character.toString(des.charAt(2));   //D
		RoundTrip.SetDeparDestLoc(RoundTrip.Txt_DestinationLocation , des1);
		RoundTrip.SetDeparDestLoc(RoundTrip.Txt_DestinationLocation , des2);
		RoundTrip.SetDeparDestLoc(RoundTrip.Txt_DestinationLocation , des3);
		Thread.sleep(1000);
		RoundTrip.selectLocation();
	//	------------------------------------------------
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(
				ExpectedConditions.elementToBeClickable(By.id("search-main-button")));
		RoundTrip.DoSearch();
		//----------------------------------

		WebElement btnchsearch = driver.findElement(By.id("toggleSearchButton"));
		
		Assert.assertTrue(btnchsearch.isDisplayed());
		System.out.println("********************TC is passed ***************************");
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

