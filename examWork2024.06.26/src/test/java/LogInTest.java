import org.example.LogInPage;
import org.example.MainPage;

import org.example.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LogInTest extends BasePageTest {
    MainPage mainPage;
    LogInPage logInPage;
    RegisterPage registerPage;

    public static final String VALID_FIRSTNAME = "Techin";
    public static final String VALID_PASSWORD = "Techin";
    public static final String INVALID_FIRSTNAME = ".";
    public static final String INVALID_PASSWORD = ".";

    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
        logInPage = new LogInPage(driver);
        registerPage = new RegisterPage(driver);
        mainPage.clickSignIn();

    }

    @Test
    void userCanRegister() {
        logInPage.login(VALID_FIRSTNAME, VALID_PASSWORD);
        String expectedMessage = "Logout out";
        String actualMessage = mainPage.getSignOutButtonText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Login dont work");

    }

    @Test
    void userCanNotRegisterwithInvalidName() throws InterruptedException {
        logInPage.login(INVALID_FIRSTNAME, VALID_PASSWORD);
        String expectedMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        String actualMessage = logInPage.getErrorMessageInvalidCredentials();
        Assertions.assertEquals(expectedMessage, actualMessage, "Login works with incorrect email");
        logInPage.clickButtonSignIn();
    }

    @Test
    void userCanNotRegisterwithInvalidPassword() throws InterruptedException {
        logInPage.login(VALID_FIRSTNAME, INVALID_PASSWORD);
        String expectedMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        String actualMessage = logInPage.getErrorMessageInvalidCredentials();
        Assertions.assertEquals(expectedMessage, actualMessage, "Login works with incorrect password");

    }
}

