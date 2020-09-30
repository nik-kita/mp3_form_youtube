package locators;

import org.openqa.selenium.By;

public enum SearchResultsLocator implements Locator {
    FILTERS(By.cssSelector("ytd-toggle-button-renderer a")),

    ;
    private By path;

    SearchResultsLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return null;
    }
}
