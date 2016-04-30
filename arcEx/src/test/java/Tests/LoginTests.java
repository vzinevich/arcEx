package Tests;

import Helpers.NavigationElement;
import Pages.Account;
import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by student on 4/28/2016.
 */
public class LoginTests {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://login.live.com");
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() throws InterruptedException {
        Login login = new Login(driver);
        Account accountPage = new Account(driver);
        NavigationElement navigation = new NavigationElement(driver);
        login.login();
        Assert.assertTrue(accountPage.isOnAccount());
        navigation.goToYourInfo();
        Thread.sleep(4000);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
