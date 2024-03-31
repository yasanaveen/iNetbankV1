package com.BaseTest;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {


	public static WebDriver driver;
	String demoBankUrl="https://demo.guru99.com/v3/index.php";

	public static Logger log;

	//@Parameters("browser")
	@BeforeTest
	public void setUp()
	{



		log = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		log.info("Chrome Browser Opened successfully...");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		if(br.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			log.info("Chrome Browser Opened successfully...");
		}
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			log.info("firefoxBrowser Opened successfully...");
		}
		else if(br.equals("ie"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			log.info("Internet Browser Opened successfully...");
		}
		 */


		driver.get(demoBankUrl);
		log.info("Application URL Opened successfully");




	}

	public String randomString()
	{
		String generatedstring= RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	public static String randomNumber()
	{
		String generatedNumber=RandomStringUtils.randomAlphanumeric(4);
		return(generatedNumber);


	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
		log.info("Browser closed successfully...");
	}


	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+ "/Screenshots/"+ tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
