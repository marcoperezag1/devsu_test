package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPurchase extends TestBaseWeb {

    @DataProvider(name="purchaseData")
    public Object[][] TestDataFeed(){
        Object [][] data=new Object[1][6];
        data[0][0]="Marco";
        data[0][1]="Switzerland";
        data[0][2]="Bern";
        data[0][3]="BBVA";
        data[0][4]="March";
        data[0][5]="2024";
        return data;
    }

    @Test(dataProvider="purchaseData")
    public void purchaseTwoProducts(String name, String country, String city, String card, String month, String year) throws Exception {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        homePage.addProductToCart(0);
        productPage.clickAddToCart(0);
        Thread.sleep(2000);
        homePage.addProductToCart(1);
        productPage.clickAddToCart(1);
        Thread.sleep(2000);
        driver.get("https://www.demoblaze.com/cart.html");
        Thread.sleep(2000);
        cartPage.clickPlaceOrderButton();
        cartPage.setName(name);
        cartPage.setCountry(country);
        cartPage.setCity(city);
        cartPage.setCard(card);
        cartPage.setMonth(month);
        cartPage.setYear(year);
        cartPage.clickPurchaseButton();
        Thread.sleep(2000);

    }

}
