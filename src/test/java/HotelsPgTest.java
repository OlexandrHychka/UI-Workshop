import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class HotelsPgTest {

    SpiceJetNavMenu spiceJetNavMenu = new SpiceJetNavMenu();
    HotelsPg hotelsPg = new HotelsPg();

    @BeforeMethod
    public void SetUp(){
        //browser = "chrome";
        browser = "firefox";
    }

    @AfterMethod
    public void Close(){
        close();
    }

    @Test
    public void staticDropDownTest(){
        open("http://www.spicejet.com/");

        spiceJetNavMenu.navToHotels();
        Assert.assertTrue(hotelsPg.chkHotelsPgDisplay());

        hotelsPg.selectItemByIndex(4);

        System.out.println(hotelsPg.getSelectedValue());

        Assert.assertEquals(hotelsPg.getSelectedValue(), "5");
    }

}
