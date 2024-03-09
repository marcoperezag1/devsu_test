package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how= How.XPATH, using="//a[@href='prod.html?idp_=1']") WebElement product_id1;

    public void clickProductId1() throws InterruptedException {
        product_id1.click();
        Thread.sleep(1000);
    }

}
