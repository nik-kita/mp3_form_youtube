package pageobjects.youtube;

import locators.youtube.PlayListLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BasePageObject;

import java.util.ArrayList;
import java.util.List;

public class PlayListYouPO extends BasePageObject {
    List<String> allVideosUrls;

    public PlayListYouPO(WebDriver driver) {
        super(driver);
    }

    public List<String> getVideoUrls(int max) {
        new WebDriverWait(driver, 4)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PlayListLocator.PLAYLIST_ITEM.getPath()));
        List<WebElement> allVideoLinks = driver.findElements(PlayListLocator.PLAYLIST_ITEM_A_ELEMENT.getPath());
        allVideosUrls = new ArrayList<>();
        for(WebElement a : allVideoLinks) {
            if (--max < 0) break;
            allVideosUrls.add(a.getAttribute("href"));
        }

        return allVideosUrls;
    }
}
