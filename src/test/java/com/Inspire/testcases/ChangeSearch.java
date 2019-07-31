package com.Inspire.testcases;
import org.testng.annotations.Test;
import com.Inspire.pages.SearchForTrip;
import com.Inspire.base.TestBase;

public class ChangeSearch extends TestBase{
	
	
	
	@Test
	public void Research() throws InterruptedException{
		
			
		SearchForTrip OneWayTrip;
		OneWayTrip = new SearchForTrip(driver);
		
		OneWayTrip.ChangeSearch();
		OneWayTrip.Clear(OneWayTrip.Txt_DestinationLocation);
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "D");
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "X");
		OneWayTrip.SetDeparDestLoc(OneWayTrip.Txt_DestinationLocation , "B");
		Thread.sleep(500);
		OneWayTrip.selectLocation();
		OneWayTrip.ShowAdvanced();
		OneWayTrip.SelectTravellers();
		Thread.sleep(150);
		OneWayTrip.AddAdult();
		OneWayTrip.Research();
		
		
		//We need to assert on the new search result that displayed
		
		
		
	}
	

	

}
