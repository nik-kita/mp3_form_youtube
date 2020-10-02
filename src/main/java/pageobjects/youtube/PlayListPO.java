package pageobjects.youtube;

import locators.youtube.PlayListLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;

import java.util.ArrayList;
import java.util.List;

public class PlayListPO extends BasePageObject {
    List<String> allVideosUrls;

    public PlayListPO(WebDriver driver) {
        super(driver);
    }

    public List<String> getAllVideoUrls() {
        new WebDriverWait(driver, 4)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PlayListLocator.PLAYLIST_ITEM.getPath()));
        List<WebElement> allVideoLinks = driver.findElements(PlayListLocator.PLAYLIST_ITEM_A_ELEMENT.getPath());
        allVideosUrls = new ArrayList<>();
        for(WebElement a : allVideoLinks) {
            allVideosUrls.add(a.getAttribute("href"));
        }

        return allVideosUrls;
    }
}
