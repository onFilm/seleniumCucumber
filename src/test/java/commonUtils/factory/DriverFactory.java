package commonUtils.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initializeDriver(String browser){
        WebDriver tempDriver;
        switch (browser) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                tempDriver = new ChromeDriver();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                tempDriver = new FirefoxDriver();
            }
            default -> throw new IllegalStateException("Unexpected value: " + browser);
        }
        prepareBrowser(tempDriver);
        DriverFactory.driver.set(tempDriver);
        return tempDriver;
    }

    // This function returns a WebDriver with maximized window and 30 second
    // wait
    private static void prepareBrowser(WebDriver driver) {
        System.out.println("Setup basic WebDriver configurations");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
