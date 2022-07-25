package com.Lambdatest.stepdefs;

import com.Lambdatest.util.Utility;
import com.Lambdatest.RunWebDriverCucumberTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DemoSteps {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = RunWebDriverCucumberTests.getManagedWebDriver().getWebDriver();

    }

    @Given("^Navigate to website '(.+)'$")
    public void Navigate_to_website(String url) throws Throwable {
        driver.get(url);
        Thread.sleep(2000);
    }


    @After
    public void teardown(Scenario scenario) throws Exception {
        driver.quit();
    }
}
