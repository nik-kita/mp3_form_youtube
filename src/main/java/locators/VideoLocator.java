package locators;

import org.openqa.selenium.By;

public enum VideoLocator implements Locator {
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
