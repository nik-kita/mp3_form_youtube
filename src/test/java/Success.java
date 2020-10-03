import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.mp3.HomeMp3PO;
import shortcuts.Youtube;

public class Success extends MyTestRunner {


    @Test(dataProvider = "urls")
    public void test(String url) throws InterruptedException {
        driver.get("https://mp3-youtube.download/ru/free-audio-converter");
        new HomeMp3PO(driver).goDownloadMpePage(url).download();

    }

    @DataProvider
    public Object[] urls() {
        driver.get("https://www.youtube.com/");
        return Youtube.getAllUrlsFromPlaylistSearchingBy("laravel", driver).toArray();
    }

}

