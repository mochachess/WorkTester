import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.awt.image.PixelConverter;

import java.awt.*;

public class CalcTest {
    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);
        StartPage startPage = new StartPage(driver);

        startPage.homePage();
        startPage.signIn();

        HomePage homePage = loginPage.loginAs("mentos_vist@mail.ru", password);
        Thread.sleep(1500);

        homePage.avatarClick();
        Thread.sleep(1500);
        homePage.loginCheck();
        Thread.sleep(1500);
//        homePage.signOutPage();
//        Thread.sleep(1500);
        homePage.pasteStatus();
        Thread.sleep(2000);

        homePage.pasteStatus();
        homePage.enterStatus();
    }


}
