import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FlightsPg {

    //Locators

    ElementsCollection listOfItemsToDropDown = $$(By.xpath("(//div[@id='dropdownGroup1'])[2]/div/ul/li"));
    SelenideElement fromDropDownIcon = $(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
    SelenideElement multicityRB = $(byValue("TripPlanner"));
    SelenideElement popUpTitle = $(new Selectors.ByText("Information"));
    SelenideElement familyCheckBox = $(byId("ctl00_mainContent_chk_friendsandfamily"));




    //Methods

    public void selectItemFromDropDown(String value){
        fromDropDownIcon.click();
        $(By.xpath("//a[@text='" + value +"']")).click();
    }


    public Integer countNumberOfItems(){
        int result = listOfItemsToDropDown.size();
        return result;
    }

    public void selectRB(){
        multicityRB.selectRadio("TripPlanner");
    }

    public boolean chkTitleDisplayed(){
        boolean result = popUpTitle.is(visible);
        return result;
    }

    public boolean chkCheckBoxChecked(SelenideElement element){
        boolean result = element.is(checked);
        return result;
    }





}
