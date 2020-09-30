package locators;

import org.openqa.selenium.By;

public enum PlayListLocator implements Locator {
    PLAYLIST_ITEM(By.cssSelector("#items ytd-playlist-panel-video-renderer")),
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
