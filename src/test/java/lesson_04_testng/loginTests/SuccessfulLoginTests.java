package lesson_04_testng.loginTests;

import lesson_04_testng.BaseTest;
import lesson_04_testng.LoginPage;
import lesson_04_testng.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLoginTests extends BaseTest {

    @Test(testName = "Login with standard_user")
    public void test_01() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        loginPage.loginToApp("standard_user", "secret_sauce");
        productsPage.validateTitle("PRODUCTS");
    }

    @Test(testName = "Login with problem_user")
    public void test_02() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        loginPage.loginToApp("problem_user", "secret_sauce");
        Assert.assertEquals(productsPage.getTitle(), "PRODUCTS");
    }


    @Test(testName = "Login with performance_glitch_user")
    public void test_03() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        loginPage.loginToApp("performance_glitch_user", "secret_sauce");
        Assert.assertTrue(productsPage.getTitle().equalsIgnoreCase("products"));
    }

}
