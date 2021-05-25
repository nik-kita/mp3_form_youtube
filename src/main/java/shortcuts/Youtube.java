package shortcuts;

import org.openqa.selenium.WebDriver;
import pageobjects.youtube.HomeYouPO;
import pageobjects.youtube.SearchResultsYouPO;

import java.util.List;

public class Youtube {

    public static List<String> getAllUrlsFromThisPlayList(String url, int max, WebDriver driver) {
        driver.get(url);

        return new SearchResultsYouPO(driver)
                .getPlayList()
                .getVideoUrls(max);
    }

    public static List<String> getAllUrlsFromPlaylistSearchingBy(String query, int max, WebDriver driver) {

        return new HomeYouPO(driver)
                .searchQuery(query)
                .addPlaylistFilter()
                .getPlayList()
                .getVideoUrls(max);
    }
}
