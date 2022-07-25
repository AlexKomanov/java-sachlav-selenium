package lesson_01_basics_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstTest {
    public static void main(String[] args) throws InterruptedException {

        //Setup of the required chrome driver
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();

        //Initialization of the required chrome driver
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        //Maximize browser window
        driver.manage().window().maximize();

        //Open required url address
        driver.get("https://www.google.com/");

        // получить адрес страницы
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // получить исходный код страницы
        System.out.println("driver.getPageSource() = " + driver.getPageSource());

        // получить заголовок страницы
        System.out.println("driver.getTitle() = " + driver.getTitle());

        // переходим по новому адресу
        driver.navigate().to("https://chromedriver.chromium.org/downloads");

        // переходим назад
        driver.navigate().back();

        // переходим вперёд
        driver.navigate().forward();

        //обновляем окно
        driver.navigate().refresh();


        Thread.sleep(3000);

        //Close browser
        driver.quit();




    }
}
