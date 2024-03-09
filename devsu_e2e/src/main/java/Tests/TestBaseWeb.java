package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBaseWeb {

    public static WebDriver driver = null;

    @BeforeSuite
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/marco/Desktop/devsu_proj/devsu/src/main/resources/chromedriver104");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseUrl = "https://www.demoblaze.com/";
        driver.get(baseUrl);
        driver.manage().window().fullscreen();
    }

    @AfterSuite
    public void tearDown() throws IOException {
        driver.close();
    }

}
