package com.Guru99BankApplicationWebPagesTesting;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Guru99BankApplicationWebPages.Guru99Bank_LoginPage;

public class Guru99Bank_LoginPageTest extends BaseTest {

	//Guru99Bank_LoginPage loginPage;

	@Test(priority = 1)
	public void LoginPageValidation() throws IOException, InterruptedException {

		Guru99Bank_LoginPage loginPage = new Guru99Bank_LoginPage();

		loginPage.DemoBankLoginPage_Text();

		loginPage.validation_Tittle();

		loginPage.DemoBankLoginDetails("mngr562938", "ruvUnut");

		loginPage.clickSubmit();


		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			log.info("Test is Passed");
		} 
		else
		{
			captureScreen(driver, "LoginPageValidation");
			Assert.assertTrue(false);
			log.info("Test is Failed");

		}

		loginPage.logout();
		log.info("bank Logouted...");

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		String msge = alert.getText();
		// System.out.println("Text is :-"+msge);
		log.info("alert text is:-" + msge);
		alert.accept();
	}

}
