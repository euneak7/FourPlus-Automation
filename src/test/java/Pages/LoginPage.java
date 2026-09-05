package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("username");
    By Password = By.id("password");
    By loginButton = By.className("login-submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {

        driver.findElement(username).sendKeys(email);

        driver.findElement(Password).sendKeys(password);

        driver.findElement(loginButton).click();
    }
}