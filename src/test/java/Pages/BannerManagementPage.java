package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BannerManagementPage {
    WebDriver driver;
    public BannerManagementPage ( WebDriver driver){
        this.driver = driver;
    }
    By Banner = By.cssSelector("a[href='/banners']");


    public void ClickBannerManagementPage(){
        driver.findElement(Banner).click();
    }
}
