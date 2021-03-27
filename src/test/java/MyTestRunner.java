import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class MyTestRunner {
    WebDriver driver;
    boolean withOptions = false;

    @BeforeClass
    public void settingDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = null;
        options = new ChromeOptions();options.addArguments("--headless");
        if (withOptions) {
            driver = new ChromeDriver(options);
        } else {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterClass
    public void destroyDriver() {
        driver.quit();
    }
}
