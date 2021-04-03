package com.practice.flightsbooking;

import org.testng.annotations.Test;

import pageclasses.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
	private WebDriver driver;
	private String baseUrl;
	
  @Test
  public void LoginTest1() {
	  LoginPage.enterEmail(driver);
	  LoginPage.enterPass(driver);
	  LoginPage.clickLogin(driver);
  }


  @BeforeClass
  public void beforeClass() {
	baseUrl = "https://www.facebook.com/";
	System.setProperty("webdriver.gecko.driver", "C://Users//Nikhil//eclipse-workspace//Lib/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(baseUrl);
  }

  @AfterClass
  public void afterClass() {
  }

}
