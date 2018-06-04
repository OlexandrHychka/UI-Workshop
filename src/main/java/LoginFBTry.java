import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class LoginFBTry {

    public static void main(String[] args) {

        browser = "chrome";

        open("https://www.facebook.com/");

        $(byName("email")).setValue("________");
        $(byId("pass")).setValue("________");
        $(byValue("Log In")).click();

        if ($(By.xpath("//div[@data-click='profile_icon']")).is(visible)){
            System.out.println("You are logged in!");
        }
        else{
            System.out.println("Something went wrong. Please try again.");
        }

        close();


    }
}
