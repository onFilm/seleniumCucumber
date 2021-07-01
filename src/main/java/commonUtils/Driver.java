package commonUtils;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Driver {
    public WebDriver driver;

    public WebDriver browserSelection(String browserType){
        if (browserType.equalsIgnoreCase("CH")) {
            System.out.println("Opening chrome browser");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("CH_headless")) {
            System.out.println("Opening chrome browser");
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else if (browserType.equalsIgnoreCase("FF")) {
            System.out.println("Opening Firefox browser");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("Edge")) {
            System.out.println("Opening Edge browser");
            WebDriverManager.getInstance(DriverManagerType.EDGE).setup();
            driver = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("IE")) {
            System.out.println("Opening IE browser");
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browserType.equalsIgnoreCase("random")) {
            Random rd = new Random(); // creating Random object
            if (rd.nextBoolean()) {
                System.out.println("Opening chrome browser");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else {
                System.out.println("Opening Firefox browser");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        } else {
            System.out
                    .println("Could not understand input. Will open Chrome as default");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public WebDriver get(String browserType, String webURL) {
        browserSelection(browserType);
        driver = setConfigs(driver);
        driver.get(webURL);
        return driver;
    }

    // This function returns a WebDriver with maximized window and 15 second
    // wait
    private static WebDriver setConfigs(WebDriver driver) {

        System.out.println("Setup basic WebDriver configurations");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        return driver;
    }

}
