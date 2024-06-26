import org.example.CalculationPage;
import org.example.LogInPage;
import org.example.MainPage;
import org.example.RegisterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;


public class CalculationPageTest extends BasePageTest {
       MainPage mainaPage;
       LogInPage logInPage;
       RegisterPage registerPage;
       CalculationPage calculationPage;

       public static final String VALID_FIRSTNAME = "Techin";
       public static final String VALID_PASSWORD = "Techin";

        public static final String VALID_FIRSTNUMBER = "3";
        public static final String VALID_SECONDNUMBER = "2";

        public static final String INVALID_FIRSTNUMBER = "-3";
        public static final String INVALID_SECONDNUMBER = "-2";

        @BeforeEach
        void setUp() {
            logInPage = new LogInPage(driver);
            registerPage = new RegisterPage(driver);
            mainaPage = new MainPage(driver);
            calculationPage = new CalculationPage(driver);
            mainaPage.clickSignIn();
            logInPage.login(VALID_FIRSTNAME,VALID_PASSWORD);
                 }

        @Test
        void calculatorCalculateCorrectly() {

            calculationPage.calculate(VALID_FIRSTNUMBER,VALID_SECONDNUMBER);
            calculationPage.arithmeticSymbol();
            calculationPage.clickCalculate();
            calculationPage.clickDoneCalculation();

            String expectedAnswer = " 3 -  2 = 1 ";
            String actualAnswer = calculationPage.returnAnswer();
            Assertions.assertEquals(expectedAnswer, actualAnswer, "Result is not 1");
            System.out.println("Answer is 1");
        }

        @Test
        void calculatorCalculateFirtsNumberNotCorrectly() throws InterruptedException {
            calculationPage.calculate(INVALID_FIRSTNUMBER,VALID_SECONDNUMBER);
            String expectedMessage = "Validacijos klaida: skaičius negali būti neigiamas";
            String actualMessage = calculationPage.getErrorFirstNumberNotCorrect();
            Assertions.assertEquals(expectedMessage, actualMessage);
        }
        @Test
        void calculatorCalculateSecondNumberNotCorrectly() throws InterruptedException {
            calculationPage.calculate(VALID_FIRSTNUMBER,INVALID_SECONDNUMBER);
            String expectedMessage = "Validacijos klaida: skaičius negali būti neigiamas";
            String actualMessage = calculationPage.getErrorSecondNumberNotCorrect();
            Assertions.assertEquals(expectedMessage, actualMessage);
        }
    }