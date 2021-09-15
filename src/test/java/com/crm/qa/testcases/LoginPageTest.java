package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public LoginPageTest(){
		
		super();
		System.out.println("constructor of login page");
	}

	
	@BeforeClass
	public void setUp(){
		System.out.println("this is called after calling constructor of current class");
		initialization();
		loginPage = new LoginPage();	
	}
	

	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
	
	}
	
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
//	@DataProvider
//	public Object[][] getCRMTestData(){
//		Object data[][] = TestUtil.getTestData("contacts");
//		return data;
//	}
//	
//	
//	@Test(priority=0, dataProvider="getCRMTestData")
//	public void validateCreateNewContact(String title, String firstName, String lastName, String company){
//	
//	System.out.println(title + " " +firstName + " " + lastName + " " + company); 
//		
//		}
//	
	
	
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
