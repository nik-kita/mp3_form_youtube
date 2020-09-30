package locators.youtube;

import locators.Locator;
import org.openqa.selenium.By;

public enum SearchResultsLocator implements Locator {
    FILTERS(By.cssSelector("ytd-toggle-button-renderer a")),
    PLAYLIST_FILTER_BUTTON(By.cssSelector("a[href='/results?search_query=laravel&sp=EgIQAw%253D%253D']")),
    RESULT_PLAYLIST_TYPE(By.cssSelector("ytd-playlist-thumbnail")),

    ;
    private By path;

    SearchResultsLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
