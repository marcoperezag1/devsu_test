package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddToCart(int id) throws InterruptedException {
        String xpath = "//a[@onclick='addToCart(" + (id + 1) + ")']";
        driver.findElement(By.xpath(xpath)).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.get("https://www.demoblaze.com/");
    }

}
