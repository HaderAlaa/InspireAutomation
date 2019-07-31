package com.Inspire.pages;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult {

	WebDriver driver;
	
	public SearchResult(WebDriver driver){
		
		this.driver = driver;
	}
	
	public By duratSliderMin = By.xpath("(//span[@class='ng5-slider-span ng5-slider-pointer ng5-slider-pointer-min'])[3]");
	public By duratSliderMax = By.xpath("(//span[@class='ng5-slider-span ng5-slider-pointer ng5-slider-pointer-max'])[3]");
	
	public void moveSlidRight(By slider , int clicksNum) {
		
		Actions move = new Actions(driver);
		WebElement slidElement  = driver.findElement(slider);
		
		for(int i = 0 ; i < clicksNum ; i++) {
			
			move.clickAndHold(slidElement).sendKeys(Keys.ARROW_RIGHT);
		
		}
		
		
	}
}
