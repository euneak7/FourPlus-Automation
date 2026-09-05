package Test;

import Base.BaseClass;
import Pages.*;
import org.testng.annotations.Test;

public class AdminPanelTest extends BaseClass {

    @Test
    public void verifyAdminModules() throws InterruptedException {

        // 1. Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("admin@gmail.com", "Admin@12345");
        Thread.sleep(3000);

        // 2. Category
        CategoryPage categoryPage = new CategoryPage(driver);

        categoryPage.clickCategory();
        Thread.sleep(3000);

        // 3. Product
        ProductPage productPage = new ProductPage(driver);

        productPage.clickProductPage();
        Thread.sleep(3000);

        // 4. Orders
        OrdersPage ordersPage = new OrdersPage(driver);

        ordersPage.ClickOrdersPage();
        Thread.sleep(3000);
        // 5. Banner
        BannerManagementPage bannerPage =
                new BannerManagementPage(driver);

        bannerPage.ClickBannerManagementPage();
        Thread.sleep(3000);

        // 6. Bank Management
        BankManagementPage bankPage =
                new BankManagementPage(driver);

        bankPage.ClickBankManagementPage();

        Thread.sleep(3000);
        // 7. User Management
        UserManagementPage userPage =
                new UserManagementPage(driver);

        userPage.ClickUserManagementPage();

        Thread.sleep(3000);

        // 8. Settings
        SettingsPage settingsPage =
                new SettingsPage(driver);

        settingsPage.ClickSettingsPage();
        Thread.sleep(3000);

    }
}