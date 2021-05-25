package locators.youtube;

import locators.Locator;
import org.openqa.selenium.By;

public enum SearchResultsLocator implements Locator {
    FILTERS(By.cssSelector("ytd-toggle-button-renderer a")),
    PLAYLIST_FILTER_BUTTON(By.xpath("//yt-formatted-string[contains(text(), 'Playlist')]")),
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
