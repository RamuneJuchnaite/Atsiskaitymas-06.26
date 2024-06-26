package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CalculationPage extends BasePage {
        public CalculationPage(WebDriver driver) {
                super(driver);
        }

        @FindBy(css = "#sk1")
        @CacheLookup
        private WebElement enterFirtsNumber;

        @FindBy(xpath = "//input[@id='sk2']")
        @CacheLookup
        private WebElement enterSecondNumber;

        @FindBy(css = "select[name='zenklas'] option[value='-']")
        @CacheLookup
        private WebElement symbolMinus;

        @FindBy(css = "input[value='skaičiuoti']")
        private WebElement pressButton;
        @FindBy(css = "a[href='/skaiciai']")
        private WebElement pressDoneCalculation;
        @FindBy(css = "/body h4")
        private WebElement showAnswer;

        @FindBy(css = "span[id='sk1.errors']")
        private WebElement errorFirtsNumber;
        @FindBy(xpath = "//span[@id='sk2.errors']")
        private WebElement errorSecondNumber;


        public void typeFirstNumber(String firstNumber) {
                enterFirtsNumber.clear();
                enterFirtsNumber.sendKeys(firstNumber);
        }

        public void typeSecondNumber(String secondNumber) {
                enterSecondNumber.clear();
                enterSecondNumber.sendKeys(secondNumber);
        }

        public void arithmeticSymbol() {
                symbolMinus.click();
        }

        public void clickCalculate() {
                pressButton.click();
        }

        public void clickDoneCalculation() {
                pressDoneCalculation.click();
        }

        public String returnAnswer() {
                return showAnswer.getText();
        }

        public String getErrorFirstNumberNotCorrect() {
                return errorFirtsNumber.getText();
        }

        public String getErrorSecondNumberNotCorrect() {
                return errorSecondNumber.getText();
        }

        public void calculate(String firstNumber, String secondNumber) {
                typeFirstNumber(firstNumber);
                typeSecondNumber(secondNumber);
        }

}



