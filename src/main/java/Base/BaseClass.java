package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
        public static WebDriver driver;

        @BeforeSuite
        public void launchBrowser() {
            WebDriverManager.chromedriver().setup();
// Chrome configuration
            ChromeOptions options = new ChromeOptions();

            // Run Chrome without opening a visible browser window
            options.addArguments("--headless=new");

            // Give Chrome a fixed screen size
            options.addArguments("--window-size=1920,1080");

            // Useful when running Chrome in Jenkins/Linux
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://stage.fourplus.net");
        }

        @AfterSuite
        public void closeBrowser() {

            driver.quit();
        }

    }


