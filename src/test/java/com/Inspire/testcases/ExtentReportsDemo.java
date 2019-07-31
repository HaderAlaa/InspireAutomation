package com.Inspire.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Inspire.base.TestBase;
import com.Inspire.pages.SearchForTrip;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo extends TestBase{

	
	@Test
	public  void ExtRep() throws InterruptedException {
		// TODO Auto-generated method stub

		// start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
        
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Inspire Search for one way trip", "This test case to validate that user can search for one way trip");
        
    	SearchForTrip OneWayTrip;
		OneWayTrip = new SearchForTrip(driver);
	
		test1.log(Status.INFO, "starting Test Case");
		
		Thread.sleep(1000);
		
OneWayTrip.SelectTripType(OneWayTrip.Rdbtn_OneWay);
		
		test1.pass("User select one way trip type successfully");
	//-----------------------------------------------------	
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DepartureLocation , "C");
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DepartureLocation , "A");
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DepartureLocation , "I");
		
		Thread.sleep(500);
		OneWayTrip.selectLocation();
		
		test1.pass("User select Departure Location: Cairo international Airport");
		
	//------------------------------------------------------
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "J");
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "E");
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "D");
		
		Thread.sleep(500);
		OneWayTrip.selectLocation();
		
		test1.pass("User select Destination Location: King Abdulaziz Airport");
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
		

		test1.pass("Change Search button displayed to user");
		
		
		//------------------------------------------------------	
		

		
        test1.info("Test Case Completed");
        
        // calling flush writes everything to the log file
        extent.flush();
    
	}

}
