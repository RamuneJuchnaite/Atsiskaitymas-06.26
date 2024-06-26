//import org.example.LoginPage;
import org.example.LogInPage;
import org.example.MainPage;

import org.example.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegisterTest extends BasePageTest {
    MainPage mainPage;
    RegisterPage registerPage;
    LogInPage logInPage;
    public static final String VALID_FIRSTNAME = "Techin";
    public static final String VALID_PASSWORD = "Techin";
    public static final String VALID_CONFIRMPASSWORD = "Techin";
    public static final String INVALID_FIRSTNAME = ".";
    public static final String INVALID_PASSWORD = ".";
    public static final String INVALID_CONFIRMPASSWORD = ".";


    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        logInPage = new LogInPage(driver);
        registerPage.clickCreateNewAccount();
        registerPage.clickButtonSubmitAccount();
        //logInPage.clickButtonSignIn();
    }


    @Test
    void userCanRegister() throws InterruptedException {
        registerPage.registerUser(VALID_FIRSTNAME, VALID_PASSWORD, VALID_CONFIRMPASSWORD);
        String expectedMessage = "Logout out";
        String actualMessage = mainPage.getSignOutButtonText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Log in dont work");
    }

    @Test
    void userCanRegisterWithInvalidName() throws InterruptedException {
        registerPage.registerUser(INVALID_FIRSTNAME, VALID_PASSWORD, VALID_CONFIRMPASSWORD);
        String expectedMessage = "Šį laukelį būtina užpildyti";
        String actualMessage = registerPage.getInvalidNameErrorMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void userCanRegisterWithInvalidPassword() throws InterruptedException {
        registerPage.registerUser(VALID_FIRSTNAME, INVALID_PASSWORD, VALID_CONFIRMPASSWORD);
        String expectedMessage = "Šį laukelį būtina užpildyti";
        String actualMessage = registerPage.getInvalidPasswordErrorMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void userCanRegisterWithInvalidConfirmPassword() throws InterruptedException {
        registerPage.registerUser(VALID_FIRSTNAME, VALID_PASSWORD, INVALID_CONFIRMPASSWORD);
        String expectedMessage = "";
        String actualMessage = registerPage.getInvalidConfirmationPasswordErrorMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}

