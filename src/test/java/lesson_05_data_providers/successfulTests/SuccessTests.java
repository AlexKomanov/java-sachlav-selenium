package lesson_05_data_providers.successfulTests;

import lesson_04_testng.BaseTest;
import lesson_04_testng.LoginPage;
import lesson_04_testng.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SuccessTests extends BaseTest {

    @Test(dataProvider = "getLoginData")
    public void success_test(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.loginToApp(username, password);
        productsPage.validateTitle("PRODUCTS");
    }


    @DataProvider
    public Object[][] getLoginData() {
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},

        };
    }
}
