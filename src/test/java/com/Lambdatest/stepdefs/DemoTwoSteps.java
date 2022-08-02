package com.Lambdatest.stepdefs;

import com.Lambdatest.RunWebDriverCucumberTests;
import com.Lambdatest.pageobject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DemoTwoSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {

        driver = RunWebDriverCucumberTests.getManagedWebDriver().getWebDriver();
        loginPage = new LoginPage(driver);
}

    @Given("^Navigate to website Lambdatest '(.+)'$")
    public void Navigate_to_website_Lambdatest(String url) throws Throwable {
        driver.get(url);
        Thread.sleep(2000);

        loginPage.mark_items();
    }



    @After
    public void teardown(Scenario scenario) throws Exception {

        driver.quit();
    }
}
