package locators.downloader;

import locators.Locator;
import org.openqa.selenium.By;

public enum HomeMp3Locator implements Locator {
    INPUT_FOR_URL(By.cssSelector("input[name='url']")),


    ;

    private By path;

    HomeMp3Locator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
