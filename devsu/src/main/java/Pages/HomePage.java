package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(how= How.XPATH, using="//div[@class='col-lg-4 col-md-6 mb-4']") List<WebElement> bodyProducts;

    public void addProductToCart(int id) throws InterruptedException {
        bodyProducts.get(id).click();
        Thread.sleep(2000);
    }

}
