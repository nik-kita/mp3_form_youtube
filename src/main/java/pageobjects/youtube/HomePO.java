package pageobjects.youtube;

import locators.youtube.HomeLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.BasePageObject;

public class HomePO extends BasePageObject {

    public HomePO(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPO searchQuery(String searchStr) {
        WebElement searchInput = driver.findElement(HomeLocator.SEARCH_INPUT.getPath());
        searchInput.sendKeys(searchStr);
        searchInput.submit();
        return new SearchResultsPO(driver);
    }
}
