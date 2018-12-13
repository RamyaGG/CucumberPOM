package com.a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: Ramya GG')]")
	@CacheLookup // it store userNameLabel in cache(memory). So every time whenevrer 
	//you are interacting with the element instaed of from the page 
	//it will get the elemnt from the cache
	//But the prob is . Lets say u r on home page and some how the page got refreshed then in that case
	//cache will be corrupted. so it will give you staleElement exception
	//So If you feel that that element property wont get changed then only go for cache annotation
	//we should use it for each and every elemnt
	WebElement userNameLabel;
	
	@FindBy(xpath ="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksList;
	
	//Initializing the page objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	public boolean verifyCorrectUserName() {
		driver.switchTo().frame("mainpanel");
		return userNameLabel.isDisplayed();	
	}
	
	public void clickOnNewContactsLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	

	

}
