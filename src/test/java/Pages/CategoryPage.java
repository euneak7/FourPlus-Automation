package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoryPage {

    WebDriver driver;
    WebDriverWait wait;

    By category = By.cssSelector("a[href='/categories']");

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(category)).click();
    }
}