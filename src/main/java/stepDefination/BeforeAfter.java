package stepDefination;

import commonUtils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Page;
import pages.PageInstances;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BeforeAfter extends PageInstances {
    public Properties prop;

    @Before
    public void setup() {
        System.out.println("Inside Setup");
        String browser,url;
        prop = loadProp();
        browser = prop.getProperty("browser");
        url = prop.getProperty("url");
        driver = new Driver().get(browser,url);
        page = new Page();
    }

    @After
    public void teardown() {
        System.out.println("Inside Teardown");
        driver.quit();
    }

    public Properties loadProp () {
            try {
                prop = new Properties();
                FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
                prop.load(ip);
            } catch (IOException e) {
                e.printStackTrace();
            }
        return prop;
    }
}
