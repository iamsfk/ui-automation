package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By searchBox = By.id("search");
    private By cartIcon = By.id("cart");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchBox).submit();
    }

    public boolean isCartIconDisplayed() {
        return driver.findElement(cartIcon).isDisplayed();
    }
}
