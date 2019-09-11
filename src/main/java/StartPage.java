import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    WebDriver driver;
    By signIn = By.xpath("//a[@href='/login']");

    public StartPage(WebDriver driver){
        this.driver = driver;
    }


    public LoginPage signIn(){
        driver.findElement(signIn).click();
        return new LoginPage(driver);
    }

    public StartPage homePage(){
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        return this;
    }
}
