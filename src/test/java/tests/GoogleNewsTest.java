package tests;

import actions.GoogleSearchActions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNewsTest {

    WebDriver driver;
    GoogleSearchActions searchActions;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        searchActions = new GoogleSearchActions(driver);
    }

    @Test
    public void enterYoutubeInSearchBox() {
        searchActions.enterYoutube();
    }

    @Test
    public void clickYoutubeOnSearchResult() {
        searchActions.enterYoutube();
        searchActions.clickYoutube();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
