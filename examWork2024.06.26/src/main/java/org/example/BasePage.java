package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


// klase kuria paveldes visi kiti objektai
public class BasePage {
    protected WebDriver driver;
    public BasePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}