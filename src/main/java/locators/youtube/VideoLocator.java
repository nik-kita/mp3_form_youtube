package locators.youtube;

import locators.Locator;
import org.openqa.selenium.By;

public enum VideoLocator implements Locator {
    NEXT_BUTTON(By.cssSelector(".ytp-next-button")),


    ;

    private By path;

    VideoLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
