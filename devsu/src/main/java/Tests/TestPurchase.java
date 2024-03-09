package Tests;

import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPurchase extends TestBaseWeb {

    @DataProvider(name="contractData")
    public Object[][] TestDataFeed(){
        Object [][] data=new Object[2][4];
        data[0][0]="99999999";
        data[0][1]="Salta";
        data[0][2]="+41";
        data[0][3]="12345678";
        data[1][0]="21021300";
        data[1][1]="Buenos Aires";
        data[1][2]="+41";
        data[1][3]="87654321";
        return data;
    }

    @Test(dataProvider="contractData")
    public void checkContractWrongData(String birthday, String province, String phoneCode, String phoneNumber) throws Exception {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickProductId1();

    }

}
