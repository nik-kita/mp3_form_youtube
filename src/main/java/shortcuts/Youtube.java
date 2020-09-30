package shortcuts;

import org.openqa.selenium.WebDriver;
import pageobjects.youtube.HomePO;

import java.util.List;

public class Youtube {

    public static List<String> getAllUrlsFromPlaylistSearchingBy(String query, WebDriver driver) {
        return
        new HomePO(driver)
                .searchQuery(query)
                .addPlaylistFilter()
                .getPlayList()
                .getAllVideoUrls();
    }
}
