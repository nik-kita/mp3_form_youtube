package locators.downloader;

import locators.Locator;
import org.openqa.selenium.By;

public enum ConverterLocator implements Locator {
    INPUT_FOR_URL(By.cssSelector("input[name='url']")),


    ;

    private By path;

    ConverterLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
