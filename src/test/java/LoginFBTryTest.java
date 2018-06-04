import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginFBTryTest {


    //LOCATORS

    SelenideElement emailField = $(byName("email"));
    SelenideElement passField = $(byId("pass"));
    SelenideElement logInBtn = $(By.xpath("//label[@id='loginbutton']"));


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
    public void testLogin(){

        open("https://www.facebook.com/");

        emailField.setValue("___________");
        passField.setValue("_______");
        logInBtn.click();

        Assert.assertTrue($(By.xpath("//div[@data-click='profile_icon']")).is(visible), "Test is pass successfully.");
    }




}