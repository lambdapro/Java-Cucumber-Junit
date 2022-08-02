package com.Lambdatest.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver webDriver;


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By List1item = By.name("li1");

    private By List2item = By.name("li2");

    private By TodoText = By.id("sampletodotext");

    //Let's mark done first two items in the list.
    public void mark_items() {
        webDriver.findElement(List1item).click();
        webDriver.findElement(List1item).click();

    }

}
