package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserManagementPage {
    WebDriver driver;
    public UserManagementPage(WebDriver driver){
        this.driver = driver;
    }
    By UserManage = By.cssSelector("a[href=\"/users\"]");

    public void ClickUserManagementPage(){
        driver.findElement(UserManage).click();
    }
}
