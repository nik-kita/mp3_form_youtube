package pageobjects.youtube;

import locators.youtube.SearchResultsLocator;
import org.openqa.selenium.WebDriver;
import pageobjects.BasePageObject;

public class SearchResultsYouPO extends BasePageObject {
    public SearchResultsYouPO(WebDriver driver) {
        super(driver);
    }

    public SearchResultsYouPO addPlaylistFilter() {
        driver.findElement(SearchResultsLocator.FILTERS.getPath()).click();
        driver.findElement(SearchResultsLocator.PLAYLIST_FILTER_BUTTON.getPath()).click();
        return this;
    }

    public PlayListYouPO getPlayList() {
        driver.findElement(SearchResultsLocator.RESULT_PLAYLIST_TYPE.getPath()).click();
        return new PlayListYouPO(driver);
    }
}
