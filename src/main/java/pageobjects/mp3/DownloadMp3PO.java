package pageobjects.mp3;

import locators.downloader.DownloaPagedMp3Locator;
import locators.downloader.HomeMp3Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;

import java.util.List;
import java.util.Set;

public class DownloadMp3PO extends BasePageObject {
    public DownloadMp3PO(WebDriver driver) {
        super(driver);
    }

    public void download() throws InterruptedException {
        new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DownloaPagedMp3Locator.FAKE_BUTTON.getPath()));
        WebElement fakeBtn = driver.findElement(DownloaPagedMp3Locator.FAKE_BUTTON.getPath());
        String page = driver.getWindowHandle();
        fakeBtn.click();
        Set<String> pages = driver.getWindowHandles();
        for(String str : pages) {
            if(!str.equals(page)) {
                driver.switchTo().window(str);
                driver.close();
            }
        }
        driver.switchTo().window(page);


        WebElement trueBtn = driver.findElement(DownloaPagedMp3Locator.TRUE_BUTTON.getPath());
        trueBtn.click();



    }

    public void switchToTab() {
        //Switching between tabs using CTRL + tab keys.
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
        //Switch to current selected tab's content.
        driver.switchTo().defaultContent();
    }


}
