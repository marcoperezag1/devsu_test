package Tests;

import Pages.HomePage;
import Pages.ProductPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPurchase extends TestBaseWeb {

    @Test
    public void purchaseTwoProducts() throws Exception {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        homePage.addProductToCart(0);
        productPage.clickAddToCart(0);
        Thread.sleep(2000);
        homePage.addProductToCart(1);
        productPage.clickAddToCart(1);
        Thread.sleep(2000);
        driver.get("https://www.demoblaze.com/cart.html");
        Thread.sleep(2000);

    }

}
