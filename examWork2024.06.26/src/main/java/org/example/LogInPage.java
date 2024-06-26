package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(css = "[name = username]")
    private WebElement inputLogInUserName;
    @FindBy(css = "[name = password]")
    private WebElement inputLogInPassword;
    @FindBy(css = "button[type='submit']")
    private WebElement buttonSubmitAccount;
    @FindBy(css = ".form-group has-error")
    private WebElement errorAfterRegistration;



   public String getErrorMessageInvalidCredentials(){
            return errorAfterRegistration.getText();
   }


    public void typeUserName(String name){ inputLogInUserName.sendKeys(name); }
    public void typePassword(String password) {inputLogInPassword.sendKeys(password); }
    public void clickButtonSignIn() {buttonSubmitAccount.click(); }

    public void login (String name, String password) {
        typeUserName(name);
        typePassword(password);
         clickButtonSignIn();

    }

    }

