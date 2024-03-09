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
    @FindBy(how= How.XPATH, using="//input[@id='name']") WebElement name;
    @FindBy(how= How.XPATH, using="//input[@id='country']") WebElement country;
    @FindBy(how= How.XPATH, using="//input[@id='city']") WebElement city;
    @FindBy(how= How.XPATH, using="//input[@id='card']") WebElement card;
    @FindBy(how= How.XPATH, using="//input[@id='month']") WebElement month;
    @FindBy(how= How.XPATH, using="//input[@id='year']") WebElement year;
    @FindBy(how= How.XPATH, using="//button[text()='Purchase']") WebElement purchaseButton;

    public void clickPlaceOrderButton() throws InterruptedException {
        placeOrderButton.click();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
    }

    public void setName(String text) throws InterruptedException {
        name.clear();
        name.sendKeys(text);
    }

    public void setCountry(String text) throws InterruptedException {
        country.clear();
        country.sendKeys(text);
    }

    public void setCity(String text) throws InterruptedException {
        city.clear();
        city.sendKeys(text);
    }

    public void setCard(String text) throws InterruptedException {
        card.clear();
        card.sendKeys(text);
    }

    public void setMonth(String text) throws InterruptedException {
        month.clear();
        month.sendKeys(text);
    }

    public void setYear(String text) throws InterruptedException {
        year.clear();
        year.sendKeys(text);
    }

    public void clickPurchaseButton() throws InterruptedException {
        driver.manage().window().fullscreen();
        purchaseButton.click();
        Thread.sleep(2000);
    }

}
