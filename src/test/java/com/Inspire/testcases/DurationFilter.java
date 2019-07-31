package com.Inspire.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Inspire.base.TestBase;
import com.Inspire.pages.SearchForTrip;
import com.Inspire.pages.SearchResult;
public class DurationFilter extends TestBase {
	
	SearchForTrip searchPage;
	SearchResult resultPage; 
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	
		resultPage = new SearchResult(driver);
		searchPage = new SearchForTrip(driver);
		
		
		searchPage.scatterLoc(searchPage.Txt_DepartureLocation, "CAI");
		//------Enter departure of first trip------
		
		Thread.sleep(1000);
		searchPage.selectLocation();
		
	//------------------------------------------------------
		
		//------Enter destination of first trip------
		
		searchPage.scatterLoc(searchPage.Txt_DestinationLocation, "jed");
		
		Thread.sleep(1000);
		searchPage.selectLocation();
		
	//------------------------------------------------------
		Thread.sleep(1000);
		searchPage.SelectCabinDegree(1);
		
	//------------------------------------------------------	

	//Select tomorrow for 1st trip
		
		int currentDate = 0;
		Thread.sleep(2000);	
		searchPage.selectDate(searchPage.Cal_DepDate , currentDate + 10);
		Thread.sleep(4000);
		searchPage.selectDate(searchPage.Cal_DepDateReturn , currentDate + 62);
		Thread.sleep(4000);
		searchPage.DoSearch();
		Thread.sleep(1000);
	}
	
	@Test
	public void run() {
		
	}
	
}

