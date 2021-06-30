package TestUtil;

import commonUtils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import pages.BasicVariables;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BeforeAfter {
    public Properties prop;

    @Before
    public void setup() {
        System.out.println("Inside Setup");
        String browser,url;
        prop = loadProp();
        browser = prop.getProperty("browser");
        url = prop.getProperty("url");
        BasicVariables.driver = new Driver().get(browser,url);
    }

    @After
    public void teardown() {
        System.out.println("Inside Teardown");
        BasicVariables.driver.quit();
    }

    public Properties loadProp () {
            try {
                prop = new Properties();
                FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/config/config.properties");
                prop.load(ip);
            } catch (IOException e) {
                e.printStackTrace();
            }
        return prop;
    }
}
