package Helpers;

import org.openqa.selenium.WebDriver;
import static Helpers.Locator.get;

/**
 * Created by student on 4/28/2016.
 */
public class NavigationElement {
    WebDriver _driver;

    public NavigationElement(WebDriver driver){
        _driver = driver;
    }

    public void goToYourInfo(){
        _driver.findElement(get("Navigation.yourinfo")).click();
    }
}
