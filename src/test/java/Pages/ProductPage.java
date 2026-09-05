package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By product = By.cssSelector("a[href='/products']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickProductPage() {

        System.out.println("Current URL: " + driver.getCurrentUrl());

        wait.until(ExpectedConditions.presenceOfElementLocated(product));

        System.out.println("Product found");

        wait.until(ExpectedConditions.elementToBeClickable(product)).click();

        System.out.println("Product clicked");
    }
}