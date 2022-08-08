package lesson_04_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class CommonElements extends BasePage{

    @FindBy(css = "[class=\"shopping_cart_link\"]")
    WebElement cart;
    @FindBy(css = "[id=\"react-burger-menu-btn\"]")
    WebElement burgerMenu;

    public CommonElements(WebDriver driver) {
        super(driver);
    }

    public String getItemsInCart() {
        return getElementText(cart);
    }

    public void openBurgerMenu() {
        clickElement(burgerMenu);
    }
}
