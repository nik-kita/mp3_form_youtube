import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class MyTestRunner {
    WebDriver driver;
    boolean withOptions = false;

    @BeforeClass
    public void settingDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = null;
        options = new FirefoxOptions();
        options.addArguments("--headless");
        if (withOptions) {
            driver = new FirefoxDriver(options);
        } else {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterClass
    public void destroyDriver() {
        driver.quit();
    }
}
