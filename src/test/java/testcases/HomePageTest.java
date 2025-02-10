package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import base.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void testSearchFunctionality() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Laptop");
        Assert.assertTrue(driver.getTitle().contains("Laptop"), "Search results are incorrect!");
    }

    @Test
    public void testCartIconPresence() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isCartIconDisplayed(), "Cart icon is missing!");
    }
}
