package com.Guru99BankApplicationWebPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.BaseTest.BaseTest;

public class EditCustomer_PageObjects extends BaseTest{
	
	
	
	public  EditCustomer_PageObjects()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	WebElement Editcustomer;
	
	
	@FindBy(name = "cusid")
	WebElement entercustomerId;
	
	
	@FindBy(name = "AccSubmit")
	WebElement clickOnsubmit;
	
	@FindBy(xpath = "//tbody/tr[4]/td[2]/input[1]")
	WebElement cNameText;
	
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement clickOnLogout;
	//	57505
	
	public void clickOnEditcust()
	{
		Editcustomer.click();
	}
	
	public void EnterCustomerID()
	{
		entercustomerId.sendKeys("57505");
	}
	
	public void clickSubmit()
	{
		clickOnsubmit.click();
	}
	
	public void textOfcName()
	{
	    String text= cNameText.getAttribute("value");
	    System.out.println("The attribute Name is :-"+text);
	}
	
	public void logout()
	{
		clickOnLogout.click();
	}
	
	
	
	

}
