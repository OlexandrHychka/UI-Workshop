import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SpiceJetNavMenu {

    //Locators

    SelenideElement hotelsBtn = $(By.xpath("//a[@title='Hotels']"));


    //Methods
    public void navToHotels(){
        hotelsBtn.click();
    }
}
