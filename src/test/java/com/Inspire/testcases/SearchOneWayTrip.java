package com.Inspire.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Inspire.pages.SearchForTrip;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.Inspire.base.TestBase;

public class SearchOneWayTrip extends TestBase{
	
	
	
	@Test
	public void OneWayTrip() throws InterruptedException, IOException{
		
			
		
		// start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
        
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Inspire Search for one way trip", "This test case to validate that user can search for one way trip");
        
      //-----------------------------------------------------	
        
		SearchForTrip OneWayTrip;
		OneWayTrip = new SearchForTrip(driver);
	
		test1.log(Status.INFO, "Starting Test Case 1");
		
		Thread.sleep(1000);
		
		OneWayTrip.SelectTripType(OneWayTrip.Rdbtn_OneWay);
		//-----------------------------------------------------	
			OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DepartureLocation , "C");
			OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DepartureLocation , "A");
			OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DepartureLocation , "I");
			
			Thread.sleep(1000);
			OneWayTrip.selectLocation();
			Thread.sleep(1000);
		//------------------------------------------------------
			OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "J");
			OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "E");
			OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "D");
			
			Thread.sleep(1000);
			OneWayTrip.selectLocation();
			Thread.sleep(1000);
		//------------------------------------------------------
			
			OneWayTrip.SelectCabinDegree(1);
		
	//------------------------------------------------------	

		OneWayTrip.SelectTripDate(OneWayTrip.Cal_DepDate);
	
		

	//------------------------------------------------------
		
		OneWayTrip.SelectTravellers();
		Thread.sleep(150);
		OneWayTrip.AddAdult();
		OneWayTrip.SubAdult();
		OneWayTrip.AddChild();
		OneWayTrip.SubChild();
		OneWayTrip.AddInfant();
		OneWayTrip.SubInfant();
		
		
	//------------------------------------------------------	
		
		OneWayTrip.DoSearch();
		
	//------------------------------------------------------	
		
		WebElement btnchsearch = driver.findElement(By.id("toggleSearchButton"));
		Assert.assertTrue(btnchsearch.isDisplayed());
		test1.pass("Assertion_1: Change Search Button Displayed ");
		
        driver.findElement(By.id("departureAirport_0"));
		Assert.assertEquals("CAI - Cairo", "CAI - Cairo");
		test1.pass("Assertion_2 : The Deprature Airport in the result page displayed correctly ");
		
		driver.findElement(By.id("arrivalAirport_0"));
		Assert.assertEquals("JED - Jeddah", "JED - Jeddah");
		test1.pass("Assertion_3 : The Arrival Airport in the result page displayed correctly ");
		test1.info("Test Case Status: Passed ");
		
		// calling flush writes everything to the log file
        extent.flush();
    
		
		
	}
	

	

}
