package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/registruoti']")
    private WebElement linkCreateNewAccount;
    @FindBy(css = "#username")
    private WebElement inputLogInUserName;
    @FindBy(css = "#password")
    private WebElement inputLogInPassword;
    @FindBy(css = "#passwordConfirm")
    private WebElement inputConfirmationPassword;
    @FindBy(css = "button[type='submit']")
    private WebElement buttonSubmitAccount;


   @FindBy(css = ".username.errors")
   private WebElement invalidNameErrorMessage;
    @FindBy(css = ".username.errors")
    private WebElement invalidPasswordErrorMessage;
    @FindBy(css = ".username.errors")
    private WebElement invalidConfirmPasswordErrorMessage;


       public void clickCreateNewAccount() {linkCreateNewAccount.click();}
        public void typeUserName (String name){inputLogInUserName.sendKeys(name);        }
        public void typeUserPassword (String password){inputLogInPassword.sendKeys(password); }
        public void typeConfirmationPassword(String confirmpassword) {
        inputConfirmationPassword.sendKeys(confirmpassword); }
        public void clickButtonSubmitAccount() {
        buttonSubmitAccount.click();
    }

    public  String getInvalidNameErrorMessage() {
            return invalidNameErrorMessage.getText();
        }
         public  String getInvalidPasswordErrorMessage() {
        return invalidPasswordErrorMessage.getText();
    }
        public  String getInvalidConfirmationPasswordErrorMessage() {
        return invalidConfirmPasswordErrorMessage.getText();
    }

        public void registerUser(String inputLogInUserName, String inputLogInPassword, String inputConfirmationPassword) {
            typeUserName(inputLogInUserName);
            typeUserPassword(inputLogInPassword);
            typeConfirmationPassword(inputConfirmationPassword);
            clickButtonSubmitAccount();
        }

            }
    //public String registerUserWithoutInvalidName() {
       // return invalidNameErrorMessage.getText();
   // }


