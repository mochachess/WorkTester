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


        driver.manage().window().maximize();
        driver.get("https://github.com/");
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        Thread.sleep(500);
        driver.findElement(By.id("login_field")).sendKeys("mentos_vist@mail.ru");
        driver.findElement(By.id("password")).sendKeys("!");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//summary[@aria-label='View profile and more']")).click();
        Thread.sleep(500);

        String wb = driver.findElement(By.xpath("//strong[@class='css-truncate-target']")).getText();
        String name = "mochaches";
        Assert.assertEquals(wb, name);
        driver.findElement(By.xpath("//button[@class='dropdown-item dropdown-signout']")).click();
    }


}