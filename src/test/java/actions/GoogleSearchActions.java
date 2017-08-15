package actions;

import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;

public class GoogleSearchActions {

    private WebDriver driver;
    GoogleSearchPage googlePage;

    public GoogleSearchActions(WebDriver driver) {
        this.driver = driver;
        googlePage = new GoogleSearchPage(driver);
    }

    public void enterYoutube() {
        googlePage.searchYoutube();
    }

    public void clickYoutube() {
        googlePage.clickYoutubeLink();
    }
}
