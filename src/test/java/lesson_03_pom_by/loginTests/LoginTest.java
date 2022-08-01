package lesson_03_pom_by.loginTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson_03_pom.BasePage;
import lesson_03_pom.LoginPage;
import lesson_03_pom.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        BasePage basePage = new BasePage(driver);
        basePage.initAndNavigate("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApp("standard_user", "secret_sauce");

//        basePage.sleep(3000);

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.validateTitle("Products");

        driver.quit();
    }
}
