package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SettingsPage {
    WebDriver driver;
    WebDriverWait wait;

    public SettingsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By settings = By.cssSelector("a[href=\"/settings\"]");

    public void ClickSettingsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(settings)).click();
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
    }

    /**
     * Clicks (navigates) each module link found on the Settings page.
     * Implementation strategy:
     * - Assumes caller is on the Settings page (or calls ClickSettingsPage first).
     * - Collects candidate links whose href contains 'settings' or is a relative path.
     * - Opens each href with driver.get(href) then returns to the main settings URL.
     *
     * NOTE: Locators are intentionally permissive; if your Settings page has a
     * specific container for module links, update the moduleContainer selector.
     */
   /* public void clickAllModules(){
        // ensure on settings page
        ClickSettingsPage();

       /* String settingsUrl = driver.getCurrentUrl();

        // Candidate container - update if your app has a dedicated module list container
        By moduleContainer = By.cssSelector("div.settings, div.settings-content, div.modules, ul.settings-list");

        List<WebElement> anchors = new ArrayList<>();
        try {
            WebElement container = wait.until(ExpectedConditions.presenceOfElementLocated(moduleContainer));
            anchors = container.findElements(By.cssSelector("a[href]"));
        } catch (Exception e){
            // fallback: collect links that contain 'settings' in href
            List<WebElement> allAnchors = driver.findElements(By.cssSelector("a[href]"));
            for (WebElement a : allAnchors){
                String href = a.getAttribute("href");
                if (href != null && (href.contains("/settings") || href.contains("settings"))) {
                    anchors.add(a);
                }
            }
        }

        // Extract hrefs to avoid StaleElementReferenceException while navigating
        List<String> hrefs = new ArrayList<>();
        for (WebElement a : anchors){
            String href = a.getAttribute("href");
            if (href != null && !href.isBlank() && !href.equals(settingsUrl)) {
                hrefs.add(href);
            }
        }

        for (String href : hrefs){
            try {
                // Open module page
                driver.get(href);
                // wait for body to load
                wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
            } catch (Exception ignored){
            } finally {
                // return to settings main page
                try { driver.get(settingsUrl); wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body"))); } catch (Exception ignored){}*/
            }




