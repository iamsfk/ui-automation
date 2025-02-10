package testcases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.LogUtils;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LogUtils.info("Starting Valid Login Test");

        // Fetching URL from config.properties
        String url = ConfigReader.getProperty("url");
        driver.get(url);
        LogUtils.info("Navigated to: " + url);

        LoginPage loginPage = new LoginPage(driver);

        // Fetching credentials from config.properties
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");

        loginPage.enterEmail(username);
        LogUtils.info("Entered Username: " + username);

        loginPage.enterPassword(password);
        LogUtils.info("Entered Password");

        loginPage.clickLogin();
        LogUtils.info("Clicked Login Button");

        LogUtils.info("Login Test Completed Successfully");
    }
}
