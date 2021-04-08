package com.itc.calc.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CaloriePage1 {
	
	@FindBy(id="cage")
	public WebElement ageTextbox;
	
	@FindBy(name="csex")
	public List<WebElement> genderList;
	
	@FindBy(linkText="BMI")
	public WebElement BMILink;
	
	public WebDriver driver;
	
	public CaloriePage1(WebDriver driver){
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	public void EnterCalorieDetails(String age, String sex){
		ageTextbox.clear();
		ageTextbox.sendKeys(age);
		if(genderList.size()>0){
			 for(WebElement gender : genderList){
				 if(gender.getAttribute("value").equals(sex)){
					 if(!gender.isSelected()){
						 gender.click();
						 break;
					 }
				 }
			 }
		 }
	}
	
	public BMIPage BMILinkClick(){
		BMILink.click();
		return new BMIPage(driver);
	}
}
