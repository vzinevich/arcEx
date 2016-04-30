package Pages;

import org.openqa.selenium.WebDriver;

import static Helpers.Locator.get;

/**
 * Created by student on 4/28/2016.
 */
public class Account {
    WebDriver _driver;

    public Account(WebDriver driver){
        _driver = driver;
    }

    public boolean isOnAccount(){
        return _driver.findElement(get("AccountPage.name")).isDisplayed();
    }
}
