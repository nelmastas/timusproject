package Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public WebDriver webDriver;
    public Driver()
    {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().deleteAllCookies();
        webDriver.manage().window().maximize();
    }
}
