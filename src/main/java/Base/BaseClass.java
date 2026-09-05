package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
        public static WebDriver driver;

        @BeforeSuite
        public void launchBrowser() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://stage.fourplus.net");
        }

        @AfterSuite
        public void closeBrowser() {

            driver.quit();
        }

    }


