import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.mp3.HomeMp3PO;
import shortcuts.Youtube;

public class Success extends MyTestRunner {

    @Test(dataProvider = "find playlist by name")
    public void test(String url) throws InterruptedException {
        driver.get("https://mp3-youtube.download/ru/free-audio-converter");
        new HomeMp3PO(driver).goDownloadMpePage(url).download();

    }
    @DataProvider(name = "find playlist by name")
    public Object[] urls() {
        driver.get("https://www.youtube.com/");
        return Youtube.getAllUrlsFromPlaylistSearchingBy("Группа Воскресенье Я ни разу за морем не был", 15, driver).toArray();
    }


    @Test(dataProvider = "use this playlist")
    public void test2(String url) throws InterruptedException {
        driver.get("https://mp3-youtube.download/ru/free-audio-converter");
        new HomeMp3PO(driver).goDownloadMpePage(url).download();
    }
    @DataProvider(name = "use this playlist")
    public Object[] urls2() {
        return Youtube.getAllUrlsFromThisPlayList("https://www.youtube.com/playlist?list=PLVt6L8YXVMxm6cU9Fnxy9CDtIolz-wIbu", 105, driver).toArray();
    }

}

