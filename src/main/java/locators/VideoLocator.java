package locators;

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
