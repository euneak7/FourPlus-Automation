package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankManagementPage {
    WebDriver driver;
    public  BankManagementPage(WebDriver driver){
        this.driver = driver;
    }
    By bankManagement = By.cssSelector("a[href='/bank-management']");
    public void ClickBankManagementPage(){
        driver.findElement(bankManagement).click();
    }
}
