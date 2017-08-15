package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchYoutube() {
        WebElement search = driver.findElement(By.id("lst-ib"));
        search.sendKeys("youtube");
        search.sendKeys(Keys.RETURN);
    }

    public void clickYoutubeLink() {
        WebElement youtubeLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a"));
        youtubeLink.click();
    }
}
