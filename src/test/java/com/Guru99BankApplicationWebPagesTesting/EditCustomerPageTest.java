package com.Guru99BankApplicationWebPagesTesting;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Guru99BankApplicationWebPages.EditCustomer_PageObjects;
import com.Guru99BankApplicationWebPages.Guru99Bank_LoginPage;

public class EditCustomerPageTest extends BaseTest{
	
	@Test
	public void Test_Edit_customerPage() throws InterruptedException, IOException
	{
		
		Guru99Bank_LoginPage logg= new Guru99Bank_LoginPage();
		logg.DemoBankLoginDetails("mngr562938", "ruvUnut");
		log.info("Enter user Name & password");
		Thread.sleep(2000);
		logg.clickSubmit();
		log.info("successfully loggedIn");
		
		
		EditCustomer_PageObjects edit= new EditCustomer_PageObjects();
		Thread.sleep(2000);
		
		edit.clickOnEditcust();
		log.info("clicked on EditCustomerLink");
		
		edit.EnterCustomerID();
		//edit.captureScreen(driver, "Test_Edit_customerPage");
		log.info("Entered customer Id");
		Thread.sleep(2000);
		
		edit.clickSubmit();
		log.info("click On submitted");

		Thread.sleep(2000);
		
		
		edit.textOfcName();
		log.info("getting text..");
		
//		Thread.sleep(2000);
//		Alert alerttext=driver.switchTo().alert();
//		System.out.println("The Allert Text Is:-"+alerttext);
		
		edit.logout();
		log.info("loggedOut...");
		
		
	}

}
