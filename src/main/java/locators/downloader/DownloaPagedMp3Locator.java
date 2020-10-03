package locators.downloader;

import locators.Locator;
import org.openqa.selenium.By;

public enum DownloaPagedMp3Locator implements Locator {
    FAKE_BUTTON(By.cssSelector("button[rel='nofollow']")),
    TRUE_BUTTON(By.xpath("//a[contains(text(), 'Загрузть файл')]")),
    MP3_LOGO(By.xpath("//a[@class='navbar-brand']"))
    ;
    private By path;

    DownloaPagedMp3Locator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
