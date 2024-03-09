package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(how= How.XPATH, using="//button[text()='Place Order']") WebElement placeOrderButton;
    public void clickPlaceOrderButton() throws InterruptedException {
        placeOrderButton.click();
        Thread.sleep(2000);
    }

}
