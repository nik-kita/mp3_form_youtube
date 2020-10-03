package shortcuts;

import org.openqa.selenium.WebDriver;
import pageobjects.youtube.HomeYouPO;

import java.util.List;

public class Youtube {

    public static List<String> getAllUrlsFromPlaylistSearchingBy(String query, WebDriver driver) {
        return
        new HomeYouPO(driver)
                .searchQuery(query)
                .addPlaylistFilter()
                .getPlayList()
                .getAllVideoUrls();
    }
}
