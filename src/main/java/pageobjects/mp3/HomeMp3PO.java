package pageobjects.mp3;

import locators.downloader.HomeMp3Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.BasePageObject;

public class HomeMp3PO extends BasePageObject {

    public HomeMp3PO(WebDriver driver) {
        super(driver);
    }


    public DownloadMp3PO goDownloadMpePage(String url) {
        WebElement search = driver.findElement(HomeMp3Locator.INPUT_FOR_URL.getPath());
        search.sendKeys(url);
        WebElement submit = driver.findElement(HomeMp3Locator.SUBMIT_BUTTON.getPath());
        submit.click();
        return new DownloadMp3PO(driver);
    }
}
