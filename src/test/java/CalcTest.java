import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
//        driver.get("https://www.performance-lab.ru/");
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//*[@id='menu-item-2613']/a")).click();
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/div/div[2]/div[1]/article/h2/a")).click();
//        Thread.sleep(500);

//        WebElement webElement = driver.findElement(By.xpath(".//*[text()='Рис. 2. Страница отчета со списком дефектов']"));
        Assert.assertTrue(true);

        driver.get("https://habr.com/ru/");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@id='search-form-btn']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(".//*[text()='Неделя']")).click();
        Thread.sleep(1500);
        driver.get("https://habr.com/ru/");
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@href='https://tmtm.ru/']")).click();
        Thread.sleep(1500);
        driver.get("https://habr.com/ru/");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@href='https://telegram.me/habr_com']")).click();
        Thread.sleep(1500);

        driver.get("https://mail.ru/");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//a [@id='mailbox:mailHeaderLink']")).click();
        Thread.sleep(1500);
        driver.get("https://mail.ru/");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//a[@title='Облако']")).click();
        Thread.sleep(1500);

        driver.get("https://mail.ru/");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//form[@action='//go.mail.ru/search']")).click();
        Thread.sleep(1500);

//        driver.get("https://google.ru/");
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//input[@name='btnI']")).click();
//        Thread.sleep(1500);


//        WebElement webElement = driver.findElement(By.xpath(".//*[text()='Рис. 2. Страница отчета со списком дефектов']"));
//        Assert.assertTrue(webElement.isDisplayed());


    }


}