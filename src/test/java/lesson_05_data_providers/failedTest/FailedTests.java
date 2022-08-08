package lesson_05_data_providers.failedTest;

import helpers.LoginErrorMessages;
import lesson_04_testng.BaseTest;
import lesson_04_testng.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FailedTests extends BaseTest {

    @Test(dataProvider = "getLoginData")
    public void failed_test_01(String username, String password, String errorMessage){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApp(username, password);
        Assert.assertEquals(loginPage.getErrorMessage(), errorMessage);
    }

    @DataProvider
    public Object[][] getLoginData() {
        return new Object[][] {
                {"locked_out_user", "secret_sauce", LoginErrorMessages.LOCKED_OUT_USER},
                {"", "secret_sauce", LoginErrorMessages.MISSING_USERNAME},
                {"standard_user", "", LoginErrorMessages.MISSING_PASSWORD},
                {"", "", LoginErrorMessages.MISSING_ALL},
                {"standard_user", "123123123", LoginErrorMessages.INCORRECT_CREDENTIALS},
        };
    }
}
