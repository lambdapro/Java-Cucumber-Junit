package com.Lambdatest.stepdefs;

import com.Lambdatest.context.TestContext;
import com.Lambdatest.pageobject.Homepage;
import com.Lambdatest.RunWebDriverCucumberTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomepageSteps {
    private WebDriver driver = RunWebDriverCucumberTests.getManagedWebDriver().getWebDriver();

    private Homepage homepage;
    private TestContext testContext;

    public HomepageSteps(TestContext testContext) {
        this.testContext=testContext;
    }
//    @Before
//    public void setUp() {
//
//
//      //  homepage = new Homepage(driver);
//
//    }

    @Given("user is on Saks.com page and enters the {string}")
    public void user_is_on_saks_com_page_and_enters_the(String string) {

        testContext.getDriver().get(string);

    }


    @After
    public void teardown(Scenario scenario) throws Exception {
        driver.quit();
    }
}
