package com.crm.qa.testcases;


import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {

	static WebDriver driver;
	static JavascriptExecutor js;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("https://www.freecrm.com/index.html");
	}

	@Test
	public void freeCrmTitleTest() throws InterruptedException, IOException {
		String title = driver.getTitle();
		System.out.println("title is: " + title);


		if (title.equals("#1 Free CRM customer relationship management software cloud")) {
			Assert.assertTrue(true);
		} else {
	
			Assert.assertTrue(false);
		}

	}

	

}
