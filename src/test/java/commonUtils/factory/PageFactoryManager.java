package commonUtils.factory;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class PageFactoryManager {
    private static LoginPage loginPage;

    public static LoginPage getLoginPage(WebDriver driver) {
        return loginPage == null ? new LoginPage(driver) : loginPage;
    }
}
