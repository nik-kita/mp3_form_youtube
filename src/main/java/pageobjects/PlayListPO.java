package pageobjects;

import locators.PlayListLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PlayListPO extends BasePageObject {
    List<String> allVideosUrls;

    public PlayListPO(WebDriver driver) {
        super(driver);
    }

    public List<String> getAllVideoUrls() {
        List<WebElement> allVideoLinks = driver.findElements(PlayListLocator.PLAYLIST_ITEM_A_ELEMENT.getPath());
        allVideosUrls = new ArrayList<>();
        for(WebElement a : allVideoLinks) {
            allVideosUrls.add(a.getAttribute("href"));
        }
        return allVideosUrls;
    }
}
