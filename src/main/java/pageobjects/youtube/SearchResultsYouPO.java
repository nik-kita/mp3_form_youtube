package pageobjects.youtube;

import locators.youtube.SearchResultsLocator;
import org.openqa.selenium.WebDriver;
import pageobjects.BasePageObject;

public class SearchResultsYouPO extends BasePageObject {
    public SearchResultsYouPO(WebDriver driver) {
        super(driver);
    }

    public SearchResultsYouPO addPlaylistFilter() {
        System.out.println("addPlaylistFilter()");
        driver.findElement(SearchResultsLocator.FILTERS.getPath()).click();
        System.out.println("Filters click");
        driver.findElement(SearchResultsLocator.PLAYLIST_FILTER_BUTTON.getPath()).click();
        System.out.println("PlayList filter click");
        return this;
    }

    public PlayListYouPO getPlayList() {
        System.out.println("getPlayList()");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(SearchResultsLocator.RESULT_PLAYLIST_TYPE.getPath()).click();
        return new PlayListYouPO(driver);
    }
}
