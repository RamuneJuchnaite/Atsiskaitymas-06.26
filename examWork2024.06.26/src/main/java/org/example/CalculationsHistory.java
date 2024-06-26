package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CalculationsHistory extends BasePage {
    public CalculationsHistory(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/skaiciai']")
    private WebElement pressDoneCalculation;

    @FindBy(css = "a[href='/atnaujinti?id=1']")
    private WebElement pressChange;
    @FindBy(css = "a[href='/trinti?id=1']")
    private WebElement pressDelete;
    @FindBy(css = "a[href='/rodyti?id=1']")
    private WebElement pressShow;

    @FindBy(xpath= " a[href='/rodyti?id=1']")
    private WebElement locationId;


   public void clickDoneCalculation() {pressDoneCalculation.click();}
    public void clickDoneCalculationChange() {pressChange.click();}
    public void clickDoneCalculationDelete() {pressDelete.click();}
    public void clickDoneCalculationShow() {pressShow.click();}
    public void clickShowId() {locationId.click();}


    }
