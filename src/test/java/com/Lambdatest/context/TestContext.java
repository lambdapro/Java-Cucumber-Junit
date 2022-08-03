//Description : Test Context is used as dependency injection. This class contains all objects of page classes.
//Author      : Sharada K
//Created on  : 05/16/2022



package com.Lambdatest.context;


import com.Lambdatest.RunWebDriverCucumberTests;
import com.Lambdatest.pageobject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestContext {
	WebDriver driver = RunWebDriverCucumberTests.getManagedWebDriver().getWebDriver();


	Homepage homepage;

	public ScenarioContext scenarioContext;

	public void setDriver(WebDriver driver) {

		this.driver = (RemoteWebDriver) driver;
	}

	public WebDriver getDriver() {
		return driver;
	}


	public Homepage getHomepage() {
		return homepage;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

	public void initializePageObjects(WebDriver driver) {

		homepage = new Homepage(driver);

		scenarioContext = new ScenarioContext();
	}
}