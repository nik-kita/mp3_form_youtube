package locators.youtube;

import locators.Locator;
import org.openqa.selenium.By;

public enum HomeLocator implements Locator {
    YOUTUBE_LOGO(By.cssSelector("#logo[href='/']")),
    SEARCH_INPUT(By.cssSelector("input#search")),



    ;
    private By path;

    HomeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
