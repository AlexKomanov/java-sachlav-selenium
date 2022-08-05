package lesson_04_testng.loginTests;

import lesson_04_testng.BaseTest;
import lesson_04_testng.LoginPage;
import lesson_04_testng.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedLoginTests extends BaseTest {

    @Test(testName = "Login with locked_out_user")
    public void test_01() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        loginPage.loginToApp("locked_out_user", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test(testName = "Login with missing username")
    public void test_02() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        loginPage.loginToApp("", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }
}
