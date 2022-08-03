package lesson_04_testng;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {

    @Test
    public void test_01() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.initAndNavigate("https://www.saucedemo.com/");
        loginPage.loginToApp("standard_user", "secret_sauce");

        productsPage.validateTitle("Productsghiufutdu");

        loginPage.sleep(3000);

        driver.quit();

    }

    @Test
    public void test_02() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.initAndNavigate("https://www.saucedemo.com/");
        loginPage.loginToApp("standard_user", "secret_sauce");

        productsPage.validateTitle("Productsghiufutdu");

        loginPage.sleep(3000);

        driver.quit();

    }


}
