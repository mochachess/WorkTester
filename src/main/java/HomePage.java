import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

    private final WebDriver driver;

    By avatar = By.xpath("//summary[@aria-label='View profile and more']");
    By loginName = By.xpath("//strong[@class='css-truncate-target']");
    By SignOutButton = By.xpath("//button[@class='dropdown-item dropdown-signout']");
    By statusButton = By.xpath("//span[@class='text-gray ml-2']");
    By statusName = By.xpath("//input[@name='message']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage avatarClick(){
        driver.findElement(avatar).click();
        return this;
    }

    public void loginCheck(){
        String wb = driver.findElement(loginName).getText();
        String name = "mochaches";
        Assert.assertEquals(wb, name);
    }

    public StartPage signOutPage(){
        driver.findElement(SignOutButton).click();
        return new StartPage(driver);
    }

    public HomePage pasteStatus(){
        driver.findElement(statusButton).click();
        return this;
    }

    public HomePage enterStatus(){
        driver.findElement(statusName).sendKeys("Yes");
        driver.findElement(By.xpath("//input[@name='limited_availability']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-caret']")).click();
        driver.findElement(By.xpath("//button[@title='in 30 minutes']")).click();
        return this;
    }
}