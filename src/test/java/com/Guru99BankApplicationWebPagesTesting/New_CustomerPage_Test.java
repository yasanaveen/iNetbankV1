package com.Guru99BankApplicationWebPagesTesting;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Guru99BankApplicationWebPages.AddNewCustomerPageObjects;

import com.Guru99BankApplicationWebPages.Guru99Bank_LoginPage;

public class New_CustomerPage_Test extends BaseTest{

	@Test(priority = 1)
	public void LoginDetails() throws InterruptedException
	{
		Guru99Bank_LoginPage login=new Guru99Bank_LoginPage();
		login.DemoBankLoginDetails("mngr562938", "ruvUnut");
		login.clickSubmit();


		AddNewCustomerPageObjects newc=new AddNewCustomerPageObjects();
		newc.Addemployee();
		newc.entercName("Naveen Yasa");
		log.info("entered customer Name");
		newc.gender("Male");
		Thread.sleep(4000);
		newc.enerDOB("21", "12", "1997");
		Thread.sleep(4000);
		newc.cAddress("Hyderabad");
		log.info("Entered customer address");
		newc.customerCity("Hyderabad");
		newc.customerState("Telangana");
		newc.customerPinCode("507305");
		newc.customerMobilenumber("8008263110");

		String email=randomString()+"@gmail.com";
		newc.customerMail(email);
		log.info("entered Mail..");

		newc.cPassword("abcef");
		Thread.sleep(4000);

		newc.submitt();
		Thread.sleep(4000);
		
		

		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");

		if(res==true)
		{
			Assert.assertTrue(true);
			log.info("test case passed");
		}
		else
		{
			Assert.assertTrue(false);
			log.info("test case failed");
		}
		
        newc.logouut();
		
		Alert alert = driver.switchTo().alert();

		String msge = alert.getText();
		// System.out.println("Text is :-"+msge);
		log.info("alert text is:-" + msge);
		alert.accept();




	}

}
