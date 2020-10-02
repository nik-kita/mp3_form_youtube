package pageobjects.youtube;

import locators.youtube.SearchResultsLocator;
import org.openqa.selenium.WebDriver;
import pageobjects.BasePageObject;

public class SearchResultsPO extends BasePageObject {
    public SearchResultsPO(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPO addPlaylistFilter() {
        driver.findElement(SearchResultsLocator.FILTERS.getPath()).click();
        driver.findElement(SearchResultsLocator.PLAYLIST_FILTER_BUTTON.getPath()).click();
        return this;
    }

    public PlayListPO getPlayList() {
        driver.findElement(SearchResultsLocator.RESULT_PLAYLIST_TYPE.getPath()).click();
        return new PlayListPO(driver);
    }
}
