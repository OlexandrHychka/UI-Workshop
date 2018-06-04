import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class FlightsPgTest {

    FlightsPg flightsPg = new FlightsPg();

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
    public void selectRBTest(){

        open("http://www.spicejet.com/");

        flightsPg.selectRB();

        Assert.assertTrue(flightsPg.chkTitleDisplayed());


    }

    @Test
    public void dinamicDropDownsTest(){

        open("http://www.spicejet.com/");

        flightsPg.selectItemFromDropDown("Adampur (AIP)");

        System.out.println(flightsPg.countNumberOfItems());
        Assert.assertTrue(flightsPg.countNumberOfItems() == 4);

    }

    @Test
    public void selectCheckBoxItem(){
        open("http://www.spicejet.com/");

        flightsPg.familyCheckBox.click();

        Assert.assertTrue(flightsPg.chkCheckBoxChecked(flightsPg.familyCheckBox));
    }
}
