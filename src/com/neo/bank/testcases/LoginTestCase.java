package com.neo.bank.testcases;

import org.testng.Assert; 
import org.testng.annotations.Test;

import com.neo.bank.packageobjects.Loginpage;

public class LoginTestCase extends BaseClass
{
	@Test
	public void test()
	{
		
		logger.info("URL is opened");
		Loginpage loginPage = new Loginpage(driver);
		loginPage.setUsername(username);
		logger.info("Entered username");
		loginPage.setPassword(password);
		logger.info("Entered password");
		loginPage.clickSubmit();
		logger.info("Clicked on Loginbtn");

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test password");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
