package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage  extends BasePage {

    @FindBy (css = "button[type='submit']")
    private WebElement buttonSignIn;
    @FindBy(css = ".logoutForm")
    private WebElement successfullyLogin;
    @FindBy(css = "a[onclick=\"document.forms['logoutForm'].submit()\"]")
    private WebElement buttonLogOut;
    @FindBy(css = "h1[class='text-center']")
    private WebElement successfullyLogout;


    // susigeneruojam konstruktoriu
    public MainPage(WebDriver driver) {super(driver);}

    public String getSignOutButtonText() { return successfullyLogin.getText();}

    public String getLogOutButtonText() {
        return successfullyLogout.getText();
    }

    public void clickSignIn(){buttonSignIn.click();}
    public void clickButtonLogOut(){buttonLogOut.click();}

}