package lesson_04_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductsPage extends BasePage {

    @FindBy(className = "title")
    WebElement title;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void validateTitle(String expectedText) {
        String titleText = getElementText(title);
        Assert.assertEquals(titleText, expectedText);
    }

    public String getTitle() {
        return getElementText(title);
    }
}
