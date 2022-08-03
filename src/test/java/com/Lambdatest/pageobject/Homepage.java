package com.Lambdatest.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Homepage {

    private WebDriver webDriver;
    @FindBy(xpath = "//button[@data-type='women']")
    WebElement womensTab;

    @FindBy(xpath = "//button[@data-type='men']")
    WebElement mensTab;

    @FindBy(xpath = "//*[@id = 'siteSearch']")
    WebElement siteSearch;

    @FindBy(xpath = "//*[@id = 'searchField']")
    WebElement searchField;

    @FindBy(id = "bfx-wm-close-button")
    WebElement modelcloseIndia;

    @FindBy(id = "consent-close")
    WebElement modelclose;

    @FindBy(css = "img[alt=\"India\"]")
    WebElement Indiaflag;

    @FindBy(id = "bfx-cc-countries-select")
    WebElement flag;

    @FindBy(id = "bfx-cc-btn")
    WebElement selectCountry;

    @FindBy(css = "span.bfx-cc-flag")
    WebElement selectflag;

    @FindBy(css = "a.create-account.btn-small.btn-secondary.btn-full-width")
    WebElement createAccountButton;

    public Homepage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // Methods

    //Method Description :This method allows to type product on search field
    public void searchItem(String searchTerm) {
        siteSearch.click();
        searchField.sendKeys(searchTerm);
        searchField.submit();

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//		WebElement searchPrompt = wait.until(ExpectedConditions.visibilityOf(siteSearch));
//		searchPrompt.sendKeys(searchTerm);
    }

    //Method Description :This method closes the Pop UP comes in India region
    public void closeIndiaPopUp() throws InterruptedException {
        //WaitHandler.waitForElementVisible(modelcloseIndia, Duration.ofSeconds(15));
//		if(modelclose.isDisplayed() && modelcloseIndia.isDisplayed()) {
//			WaitHandler.waitForElementVisible(modelcloseIndia, Duration.ofSeconds(15));
//			modelcloseIndia.click();
//			Thread.sleep(1000);
//			closePopUp();
//
//		}else if(modelclose.isDisplayed() ){
//			WaitHandler.waitForElementVisible(modelcloseIndia, Duration.ofSeconds(15));
//		modelcloseIndia.click();
//
//	Thread.sleep(1000);
//		closePopUp();
//		}
////		}else
////			System.out.println("Not present");
        try{
           // WaitHandler.waitForElementVisible(modelcloseIndia, Duration.ofSeconds(10));
            Thread.sleep(1000);
            modelcloseIndia.click();
            Thread.sleep(1000);

        }catch(Exception e){
            System.out.println("Pop up occurs in India not present");
        }
        finally {
            closePopUp();
        }
    }


    //Method Description :This method closes the pop up
    public void closePopUp() throws InterruptedException {
       // WaitHandler.waitForElementVisible(modelclose, Duration.ofSeconds(15));
        Thread.sleep(1000);
        if(modelclose.isDisplayed()) {
            modelclose.click();
        }
        Thread.sleep(1000);
    }

    public void get(String string) {
        webDriver.get(string);
    }

    //Method Description :This method sets flag to US
//    public void changeFlag(String country) {
//        //WaitHandler.waitForElementVisible(Indiaflag,Duration.ofSeconds(15));
//        //if(Indiaflag.isDisplayed()) {
//        selectflag.click();
//       // WaitHandler.waitForElementVisible(flag,Duration.ofSeconds(5));
//        Thread.sleep(1000);
//        //(flag,country);
//        utility.dropdown(flag, country);
//        selectCountry.click();
//        //}else
//        System.out.println("Country already selected");
//    }

}
