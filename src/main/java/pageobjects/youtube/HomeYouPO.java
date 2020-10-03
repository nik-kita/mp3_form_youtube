package pageobjects.youtube;

import locators.youtube.HomeLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.BasePageObject;

public class HomeYouPO extends BasePageObject {

    public HomeYouPO(WebDriver driver) {
        super(driver);
    }

    public SearchResultsYouPO searchQuery(String searchStr) {
        WebElement searchInput = driver.findElement(HomeLocator.SEARCH_INPUT.getPath());
        searchInput.sendKeys(searchStr);
        searchInput.submit();
        return new SearchResultsYouPO(driver);
    }
}
