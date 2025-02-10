package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Constructor that accepts WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
