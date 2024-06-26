import org.example.LogInPage;
import org.example.MainPage;
import org.example.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class LogOutTest extends BasePageTest {
        MainPage mainPage;
        RegisterPage registerPage;
        LogInPage loginPage;

        @BeforeEach
        void setUp() { mainPage = new MainPage(driver);
            loginPage = new LogInPage(driver);
            registerPage = new RegisterPage(driver);
            mainPage = new MainPage(driver);
            mainPage.clickSignIn();
            loginPage.typeUserName("Techin");
            loginPage.typePassword("Techin");
            loginPage.clickButtonSignIn();
            mainPage.clickButtonLogOut();}

        @Test
        void successfullyCheckout() {
            String expectedMessage = "Internetinis skaičiuotuvas";
            String actualMessage = mainPage.getLogOutButtonText();
            Assertions.assertEquals(expectedMessage, actualMessage, "Log out dont work");}

    }

