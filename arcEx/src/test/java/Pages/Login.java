package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static Helpers.Locator.get;

/**
 * Created by student on 4/28/2016.
 */
public class Login {

    WebDriver _driver;

    public Login(WebDriver driver){
        _driver = driver;
    }

    public void login(){
        _driver.findElement(get("LoginPage.loginInput")).sendKeys("vitaly.zinevich@outlook.com");
        _driver.findElement(get("LoginPage.passwordInput")).sendKeys("veron231");
        _driver.findElement(get("LoginPage.loginButton")).click();
    }


}
