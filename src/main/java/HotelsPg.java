import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byId;

public class HotelsPg {

        //Locators

        SelenideElement dropDownLabel = $(new Selectors.ByText("Check-in date"));
        SelenideElement adaltDropDown = $(byId("ddl_Adult_MST"));


        //Methods
        public boolean chkHotelsPgDisplay(){
            boolean result = dropDownLabel.waitUntil(visible, 5000).is(visible);
            return result;
        }

        public void selectItemByIndex(int i){
            adaltDropDown.selectOption(i);
        }

        public String getSelectedValue(){
            String result = adaltDropDown.getValue();
            return result;
        }
}
