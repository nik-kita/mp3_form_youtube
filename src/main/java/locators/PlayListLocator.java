package locators;

import org.openqa.selenium.By;

public enum PlayListLocator implements Locator {

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
