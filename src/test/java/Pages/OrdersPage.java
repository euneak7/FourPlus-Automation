package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersPage {
    WebDriver driver;
    public OrdersPage(WebDriver driver) {
        this.driver = driver;
    }
    By Orders = By.cssSelector("a[href='/orders']");


    public void ClickOrdersPage (){
       driver.findElement(Orders).click();
    }
}
