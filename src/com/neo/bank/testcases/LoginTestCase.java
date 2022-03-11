package com.neo.bank.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neo.bank.packageobjects.Loginpage;

public class LoginTestCase extends BaseClass
{
	@Test
	public void test()
	{
		driver.get(baseURL);
		Loginpage loginPage = new Loginpage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickSubmit();

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
