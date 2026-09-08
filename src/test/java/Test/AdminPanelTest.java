package Test;

import Base.BaseClass;
import Pages.*;
import Utilities.ExtentReportManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AdminPanelTest extends BaseClass {
    @BeforeSuite
    public void startExtentReport() {

        ExtentReportManager.startReport();
    }


    @Test
    public void verifyAdminModules() throws InterruptedException {
        ExtentReportManager.createTest("Verify Admin Modules");

        ExtentReportManager.test.info("Admin panel automation started");
        // 1. Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("admin@gmail.com", "Admin@12345");
        ExtentReportManager.test.pass("Login completed successfully");
        Thread.sleep(3000);

        // 2. Category
        CategoryPage categoryPage = new CategoryPage(driver);

        categoryPage.clickCategory();
        ExtentReportManager.test.pass("Category clicked successfully");
        Thread.sleep(3000);

        // 3. Product
        ProductPage productPage = new ProductPage(driver);

        productPage.clickProductPage();
        ExtentReportManager.test.pass("Product page clicked successfully");
        Thread.sleep(3000);

        // 4. Orders
        OrdersPage ordersPage = new OrdersPage(driver);

        ordersPage.ClickOrdersPage();
        ExtentReportManager.test.pass("Orders page clicked successfully");
        Thread.sleep(3000);
        // 5. Banner
        BannerManagementPage bannerPage =
                new BannerManagementPage(driver);

        bannerPage.ClickBannerManagementPage();
        ExtentReportManager.test.pass("Banner management page clicked successfully");
        Thread.sleep(3000);

        // 6. Bank Management
        BankManagementPage bankPage =
                new BankManagementPage(driver);

        bankPage.ClickBankManagementPage();
        ExtentReportManager.test.pass("Bank management page clicked successfully");
        Thread.sleep(3000);
        // 7. User Management
        UserManagementPage userPage =
                new UserManagementPage(driver);

        userPage.ClickUserManagementPage();
        ExtentReportManager.test.pass("User management page clicked successfully");
        Thread.sleep(3000);

        // 8. Settings
        SettingsPage settingsPage =
                new SettingsPage(driver);

        settingsPage.ClickSettingsPage();
        ExtentReportManager.test.pass("Settings page clicked successfully");
        Thread.sleep(3000);
    }

        @AfterSuite
        public void endExtentReport() {

            ExtentReportManager.endReport();
    }
}