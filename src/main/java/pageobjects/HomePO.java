package pageobjects;

import locators.HomeLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePO extends BasePageObject {

    public HomePO(WebDriver driver) {
        super(driver);
    }

    public void searchQuery(String searchStr) {
        WebElement searchInput = driver.findElement(HomeLocator.SEARCH_INPUT.getPath());
        searchInput.sendKeys(searchStr);
        searchInput.submit();
    }
}