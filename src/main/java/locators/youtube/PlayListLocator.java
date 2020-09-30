package locators.youtube;

import locators.Locator;
import org.openqa.selenium.By;

public enum PlayListLocator implements Locator {
    PLAYLIST_ITEM(By.cssSelector("#items ytd-playlist-panel-video-renderer")),
    PLAYLIST_ITEM_A_ELEMENT(By.cssSelector("#items ytd-playlist-panel-video-renderer a#wc-endpoint")),
    ;

    private By path;

    PlayListLocator(By path) {
        this.path = path;
    }
    @Override
    public By getPath() {
        return path;
    }
}
