package com.Guru99BankApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;

public class Guru99Bank_LoginPage extends BaseTest{

	public Guru99Bank_LoginPage()
	{

		PageFactory.initElements(driver, this);

	}



	@FindBy(className =   "barone")
	WebElement demoBankLogo;


	public void DemoBankLoginPage_Text()
	{
		String ExpectedText="Guru99 Bank";
		log.info("Expected Text is :-"+ExpectedText);

		String ActualText=demoBankLogo.getText();
		log.info("Actual Text is:-"+ActualText);

		if(ActualText.equals(ExpectedText))
		{
			log.info("The Text is Matched PASS");
		}
		else
		{
			log.info("The Text is Not Matched FAIL");
		}


	}

	public void validation_Tittle()
	{
		String Expected_BankTittlr=driver.getTitle();
		log.info("Expected_BankTittle"+Expected_BankTittlr);

		String ActualTittle="Guru99 Bank  HomePage";
		log.info("Actual Tittle is :"+ActualTittle);

		if(ActualTittle.equals(Expected_BankTittlr))
		{
			log.info("The Tittle is Matched PASS");
		}
		else
		{
			log.info("The Tittle is Not Matched FAIL");
		}
	}


	@FindBy(name =   "uid")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement loginButton;

	@FindBy(linkText = "Log out")
	WebElement clickOnLogout;




	public void DemoBankLoginDetails(String uName, String paSSword)
	{
		username.sendKeys(uName);
		log.info("successfully entered username");
		password.sendKeys(paSSword);
		log.info("successfully entered pasword");

	}

	public void clickSubmit()
	{
		loginButton.click();
		log.info("successfully loggedin");

	}

	public void logout()
	{
		clickOnLogout.click();
	}



}
