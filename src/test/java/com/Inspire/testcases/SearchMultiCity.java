package com.Inspire.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Inspire.base.TestBase;
import com.Inspire.pages.SearchForTrip;
import com.Inspire.data.ExcelRead;


public class SearchMultiCity extends TestBase {
	
	
	SearchForTrip multiCityTrip;

	@BeforeMethod
	public void setup() throws IOException
	{
	
		multiCityTrip = new SearchForTrip(driver);
		
	}
	
	@DataProvider (name = "multicityData" )
	public Object[][] dp_oneInput() throws IOException {
	String path = System.getProperty("user.dir") + "//Data//multiCityData.xlsx";		
		String inSheet = "input";
		ExcelRead testData = new ExcelRead();
		Object data[][] = testData.retrieveMyData(path, inSheet); 
		return data;
	}
	
	@Test(dataProvider = "multicityData")
	
	public void multiCity(String frstDepCity , String frstDestCity ,String scndDepCity , String scndDestCity ,
						  String thrdDepCity , String thrdDestCity , String frthDepCity , String frthDestCity  ) throws InterruptedException, IOException{
		//SearchForTrip multiCityTrip;
		multiCityTrip = new SearchForTrip(driver);
		Thread.sleep(1000);
		multiCityTrip.SelectTripType(multiCityTrip.Rdbtn_MultiCity);
		Thread.sleep(1000);
		multiCityTrip.scatterLoc(multiCityTrip.Txt_DepartureLocation, frstDepCity);
		//------Enter departure of first trip------
		/*
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_DepartureLocation , "C");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_DepartureLocation , "A");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_DepartureLocation , "I");
		*/
		Thread.sleep(1000);
		multiCityTrip.selectLocation();
		
	//------------------------------------------------------
		
		//------Enter destination of first trip------
		
		multiCityTrip.scatterLoc(multiCityTrip.Txt_DestinationLocation, frstDestCity);
		/*
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_DestinationLocation , "J");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_DestinationLocation , "E");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_DestinationLocation , "D");
		*/
		Thread.sleep(1000);
		multiCityTrip.selectLocation();
		
	//------------------------------------------------------
		
		multiCityTrip.SelectCabinDegree(1);
				
	//------------------------------------------------------	

	//Select tomorrow for 1st trip
		
		int currentDate = 0;
		multiCityTrip.selectDate(multiCityTrip.Cal_DepDate , currentDate + 1);
		
	//------------------------------------------------------
		//------Enter departure of second trip------
		multiCityTrip.scatterLoc(multiCityTrip.Txt_2ndDepartureLocation, scndDepCity);
		/*
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_2ndDepartureLocation , "C");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_2ndDepartureLocation , "A");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_2ndDepartureLocation , "I");
		*/
		Thread.sleep(1000);
		multiCityTrip.selectLocation();
		
	//------------------------------------------------------
		//------Enter destination of second trip------
		multiCityTrip.scatterLoc(multiCityTrip.Txt_2ndDestinationLocation, scndDestCity);
		/*
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_2ndDestinationLocation , "J");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_2ndDestinationLocation , "E");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_2ndDestinationLocation , "D");
		*/
		Thread.sleep(1000);
		multiCityTrip.selectLocation();
		//Select Date After Tomorrow for second trip
		multiCityTrip.selectDate(multiCityTrip.Cal_DepDate1 , currentDate + 2);
		
	//------------------------------------------------------
		
		//Click on add another trip
		multiCityTrip.AddTrip();
		
	//------Enter departure of third trip------
		multiCityTrip.Clear(multiCityTrip.Txt_3rdDepartureLocation);
		
		multiCityTrip.scatterLoc(multiCityTrip.Txt_3rdDepartureLocation, thrdDepCity);
		/*
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_3rdDepartureLocation , "C");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_3rdDepartureLocation , "A");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_3rdDepartureLocation , "I");
		*/
		Thread.sleep(1000);
		
		multiCityTrip.selectLocation();
		
	//------------------------------------------------------
		//------Enter destination of third trip------
		multiCityTrip.scatterLoc(multiCityTrip.Txt_3rdDestinationLocation , thrdDestCity);
		/*
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_3rdDestinationLocation , "J");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_3rdDestinationLocation , "E");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_3rdDestinationLocation , "D");
		*/
		Thread.sleep(1000);
		multiCityTrip.selectLocation();
		//Select Date (current date + 3 days) for third trip
		multiCityTrip.selectDate(multiCityTrip.Cal_DepDate2 , currentDate + 3);
		
	//------------------------------------------------------
		
		//Click on add another trip
		multiCityTrip.AddTrip();
		
		
	//------Enter departure of fourth trip------
		multiCityTrip.Clear(multiCityTrip.Txt_4thDepartureLocation);
		
		multiCityTrip.scatterLoc(multiCityTrip.Txt_4thDepartureLocation , frthDepCity);
		/*
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_4thDepartureLocation , "C");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_4thDepartureLocation , "A");
		multiCityTrip.SetDepartureLocation(multiCityTrip.Txt_4thDepartureLocation , "I");
		*/
		Thread.sleep(1000);
		multiCityTrip.selectLocation();
		
	//------------------------------------------------------
		//------Enter destination of fourth trip------
		multiCityTrip.scatterLoc(multiCityTrip.Txt_4thDestinationLocation , frthDestCity);
		/*
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_4thDestinationLocation , "J");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_4thDestinationLocation , "E");
		multiCityTrip.SetDestinationLocation(multiCityTrip.Txt_4thDestinationLocation , "D");
		*/
		Thread.sleep(1000);
		multiCityTrip.selectLocation();
		
		//Select Date (current date + 4 days) for fourth trip
		multiCityTrip.selectDate(multiCityTrip.Cal_DepDate3 , currentDate + 4);
		
	//------------------------------------------------------
		//remove 3rd trip		
		Thread.sleep(1000);
		multiCityTrip.RmvTrip(multiCityTrip.Btn_Rmv_3rd_Trip);
		
		//click search button
		Thread.sleep(1000);
		multiCityTrip.DoSearch();
		
		
	
	}
	
		
				
		
		 
	
}
