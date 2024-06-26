import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationsHistoryTest extends BasePageTest {
    MainPage mainaPage;
    LogInPage logInPage;
    RegisterPage registerPage;
    CalculationPage calculationPage;
    CalculationsHistory calculationsHistory;

    public static final String VALID_FIRSTNAME = "Techin";
    public static final String VALID_PASSWORD = "Techin";

    @BeforeEach
    void setUp() {
        logInPage = new LogInPage(driver);
        registerPage = new RegisterPage(driver);
        mainaPage = new MainPage(driver);
        calculationPage = new CalculationPage(driver);
        calculationsHistory = new CalculationsHistory(driver);
        mainaPage.clickSignIn();
        logInPage.login(VALID_FIRSTNAME,VALID_PASSWORD);
        calculationPage.clickDoneCalculation();
    }

    @Test
    void searchRecord() {


       // calculationPage.calculate(VALID_FIRSTNUMBER,VALID_SECONDNUMBER);
       // calculationPage.arithmeticSymbol();
      //  calculationPage.clickCalculate();
      //  calculationPage.clickDoneCalculation();

      //  String expectedAnswer = " 3 -  2 = 1 ";
    //    String actualAnswer = calculationPage.returnAnswer();
      //  Assertions.assertEquals(expectedAnswer, actualAnswer, "Result is not 1");
      //  System.out.println("Answer is 1");
    }


}