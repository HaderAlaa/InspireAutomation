package com.Inspire.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class SearchForTrip {

	
	WebDriver driver;
	
	public SearchForTrip(WebDriver driver){
		
		this.driver = driver;
	}
	
	//Locators
	public By Rdbtn_OneWay = By.id("tripType_2");
	public By Rdbtn_MultiCity = By.cssSelector("#tripType_3 label");
	public By Txt_DepartureLocation = By.name("departureAirport_0");
	public By Cal_DepDateReturn = By.name("departureDate_r");
	public By Txt_DestinationLocation = By.name("arrivalAirport_0");
	public By Txt_2ndDepartureLocation = By.name("departureAirport_1");
	public By Txt_2ndDestinationLocation = By.name("arrivalAirport_1");
	public By Txt_3rdDepartureLocation = By.name("departureAirport_2");
	public By Txt_3rdDestinationLocation = By.name("arrivalAirport_2");
	public By Txt_4thDepartureLocation = By.name("departureAirport_3");
	public By Txt_4thDestinationLocation = By.name("arrivalAirport_3");
	public By Lst_selectLocation = By.cssSelector("app-auto-complete div.pointer");
	public By Lst_Cabin = By.name("cabin");
	public By Cal_DepDate = By.name("departureDate_0");
	public By Cal_DepDate1 = By.name("departureDate_1");
	public By Cal_DepDate2 = By.name("departureDate_2");
	public By Cal_DepDate3 = By.name("departureDate_3");
	public By Btn_AddTrip = By.xpath("//button[@class='btn btn-link change-password-link' and text() = ' Add Another Trip']");
	public By Btn_Rmv_3rd_Trip = By.id("removeBound_2");
	public By Lst_Travelers = By.id("parent-container");
	public By Btn_AddAdult = By.id("add_adult");
	public By Btn_SubAdult = By.id("subtract_adult");
	public By Btn_AddChild = By.id("add_child");
	public By Btn_subChild = By.id("subtract_child");
	public By Btn_AddInfant = By.id("add_infant");
	public By Btn_SubInfant = By.id("subtract_infant");
	public By Btn_Search = By.id("search-main-button");
	public By Btn_ChangeSearch = By.id("toggleSearchButton");
	public By Lnk_ShowAdvanced = By.cssSelector("button.show-more");
	public By Btn_Search2 = By.id("search-single-line-button");
	public By Txt_ResultDepartureAirport = By.id("departureAirport_0");
	public By Txt_ResultArrivalAirport = By.id("arrivalAirport_0");
	public By Txt_ResultTripType = By.cssSelector("span.trip-type.px-2");

	

	
//Methods"BS"
	

	
	
//This Method to select a trip type (One way /round/ multi city)
	public void SelectTripType (By tripType){
		driver.findElement(tripType).click();
		
		//Waiting Mechanism
   	 
   	 WebDriverWait wait = new WebDriverWait(driver, 30,250);
			
			wait.until(
					ExpectedConditions.elementToBeClickable(tripType));
		
			
	}

//------------------------------------------------------------------------------------
	
		
//This Method to Enter the Departure or destination Location
	 public  void SetDeparDestLoc(By depDestTripNum , String DeparDestLocation ) {
		 
		driver.findElement(depDestTripNum ).sendKeys(DeparDestLocation);
	 }	
	 
//------------------------------------------------------------------------------------


     
//This Method to select the Deprature location from Picklist
     public void selectLocation (){
    	 
    	 driver.findElement(Lst_selectLocation).click();
    	 
     }
     
     
//------------------------------------------------------------------------------------

//This Method to select Cabin Degree
     public void SelectCabinDegree(int index){
    	 Select select= new Select(driver.findElement(Lst_Cabin));
    	 select.selectByIndex(index);
    	
 		 
     }
     
     
//------------------------------------------------------------------------------------

//This Method to set the trip date
     public void SelectTripDate(By TripDateCalNmbr){
    	 
       driver.findElement(TripDateCalNmbr).click();
       driver.findElement(By.cssSelector(".ui-datepicker > div:last-of-type .ui-datepicker-calendar-container .ui-state-default:not(.ui-state-disabled)")).click();
    	
     }
     
   
     
//------------------------------------------------------------------------------------

//This Method to select number of Travellers
     public void SelectTravellers(){
    	 
    	 driver.findElement(Lst_Travelers).click();
    	 
    	 
     }
     
//------------------------------------------------------------------------------------

//This Method to Click on add another trip
     public void AddTrip(){
    	 
    	 driver.findElement(Btn_AddTrip).click();
    	 
    	 //Waiting Mechanism
       	 
       	 WebDriverWait wait = new WebDriverWait(driver, 30,250);
    			
    			wait.until(
    					ExpectedConditions.visibilityOfElementLocated(Btn_AddTrip));
    	 	  	 
    }
     
//------------------------------------------------------------------------------------

//This Method to remove added trip
     public void RmvTrip(By RmvTripNmbr){
    	 
    	 driver.findElement(RmvTripNmbr).click();
    	 
    	//Waiting Mechanism
       	 
       	 WebDriverWait wait = new WebDriverWait(driver, 30,250);
    			
    			wait.until(
    					ExpectedConditions.visibilityOfElementLocated(RmvTripNmbr));
    	 	  	 
    }
     

     
//------------------------------------------------------------------------------------

//This Method to Click on search button with waiting mechanism till the btn changesearch displayed
     public void DoSearch(){
    	 
    	 driver.findElement(Btn_Search).click();
    	 
    	//Waiting Mechanism
       	 
       	 WebDriverWait wait = new WebDriverWait(driver, 30,250);
    			
    			wait.until(
    					ExpectedConditions.visibilityOfElementLocated(Btn_ChangeSearch));
    	 	  	 
    }
     
//------------------------------------------------------------------------------------
//This Method to Add Adults
     public void AddAdult(){
    	 
    	 driver.findElement(Btn_AddAdult).click();
     }
     
//------------------------------------------------------------------------------------
    
//This Method to Subtract Adults
     public void SubAdult(){
    	 
    	 driver.findElement(Btn_SubAdult).click();
     }
     
//------------------------------------------------------------------------------------
     
//This Method to Add Child
       public void AddChild(){
      	 
      	 driver.findElement(Btn_AddChild).click();
       }		

//------------------------------------------------------------------------------------
       
//This Method to Subtract Child
         public void SubChild(){
        	 
        	 driver.findElement(Btn_subChild).click();
         }	
         
         
//------------------------------------------------------------------------------------
         
//This Method to Add Infant
         public void AddInfant(){
          	 
          	 driver.findElement(Btn_AddInfant).click();
           }	
           
           
//------------------------------------------------------------------------------------
           
//This Method to Sub Infant
          public void SubInfant(){
            	 
            	 driver.findElement(Btn_SubInfant).click();
             }	

//------------------------------------------------------------------------------------
             
//This Method to Change search
             
           public void ChangeSearch(){
            	 
            	 
            	driver.findElement(Btn_ChangeSearch).click();
            	
            }
//------------------------------------------------------------------------------------

//This Method to Show advanced in change search area
             
           public void ShowAdvanced(){
            	 
        	   driver.findElement(Lnk_ShowAdvanced).click();
           }
             
//-------------------------------------------------------------------------------------
             
//This Method to clear the text in Departure or Destination Location field in search
             public void Clear(By depDestTripNum){
            	 
            	 driver.findElement(depDestTripNum).clear();
             }
             
//---------------------------------------------------------------------------------------
            
//This Method to do Search after change search criteria
             
             public void Research(){
            	 
            	 driver.findElement(Btn_Search2).click();
             }
             
//This method to select date in calendar 
/*
1st Parameter is for choosing which calendar (i.e if multi city search is used we have many calendars)
2d parameter is the number of dates added to the current date
*/	
        public void selectDate(By TripDateCal , int addedDate) {
        	driver.findElement(TripDateCal).click();
        	Calendar cal = Calendar.getInstance();
    			 
    		Date currentDate = new Date();
    		cal.setTime(currentDate);
    		cal.add(Calendar.DATE, addedDate);    			 
    		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    		String desiredDay = Integer.toString(dayOfMonth);
    		System.out.println(dayOfMonth); 
            List<WebElement> dates = driver.findElements(By.cssSelector("div td a.ng-star-inserted"));
            WebElement[] calendarDates = new WebElement[dates.size()];
            calendarDates = dates.toArray(calendarDates);
            for(int x = 0 ; x<calendarDates.length ; x++) {            		 
            	if(calendarDates[x + 3].getText().equals(desiredDay)) {
            		calendarDates[x + 3].click();
            		break;
            	}
            	else {
            			 
            	}
             }
        }
             
   
             
             
//This method to send departure or destination character by character
/*
1st parameter is number of departure or destination fields
2nd parameter is wanted location to scatter & send it character by character to departure or destination field
*/
        public void scatterLoc(By depDestTripNum , String wantedLoc) throws InterruptedException{
        	String letter = null;
     
        	for(int id=0 ; id<wantedLoc.length(); id++) { 
        		letter = Character.toString(wantedLoc.charAt(id));
        		SetDeparDestLoc(depDestTripNum , letter);
        		Thread.sleep(250);
        	}
         		
        }
			
             
}
	 
	 
	 
