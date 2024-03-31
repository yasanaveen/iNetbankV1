package com.Guru99BankApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class AddNewCustomerPageObjects extends BaseTest{
	
	
	public AddNewCustomerPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
    WebElement addEmployee;

    @FindBy(name = "name")
    WebElement customerName;

    @FindBy(name = "rad1")
    WebElement genderr;

    @FindBy(id = "dob")
    WebElement Enterdob;

    @FindBy(name = "addr")
    WebElement customerAddress;

    @FindBy(name = "city")
    WebElement cCity;

    @FindBy(name = "state")
    WebElement cState;

    @FindBy(name = "pinno")
    WebElement cPinnumber;

    @FindBy(name = "telephoneno")
    WebElement cMobilenumber;

    @FindBy(name = "emailid")
    WebElement cEmailId;

    @FindBy(name = "password")
    WebElement cPassword;

    @FindBy(name = "sub")
    WebElement submit;
    
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement clickOnLogout;


    public void Addemployee() {
        addEmployee.click();
    }

    public void entercName(String cName) {
        customerName.sendKeys(cName);

    }


    public void gender(String cgender) {
        genderr.click();
    }

    public void enerDOB(String dd, String mm, String yy)
    {
        Enterdob.sendKeys(dd);
        Enterdob.sendKeys(mm);
        Enterdob.sendKeys(yy);
    }

    public void cAddress(String caddress)
    {
        customerAddress.sendKeys(caddress);
    }

    public void customerCity(String city)
    {
        cCity.sendKeys(city);
    }

    public void customerState(String state)
    {
        cState.sendKeys(state);
    }

    public void customerPinCode(String pin)
    {
        cPinnumber.sendKeys(String.valueOf(pin));
    }

    public void customerMobilenumber(String mobile)
    {
        cMobilenumber.sendKeys(String.valueOf(mobile));
    }

    public void customerMail(String Mail)
    {
        cEmailId.sendKeys(Mail);
    }

    public void cPassword(String pwd)
    {
        cPassword.sendKeys(pwd);
    }

    public void submitt()
    {
        submit.click();
    }
    
    public void logouut()
    {
    	clickOnLogout.click();
    }


}
