package stepDefination;

import commonUtils.configUtil.ConfigLoader;
import commonUtils.context.TestContext;
import commonUtils.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeAfter {
    private WebDriver driver;
    private final TestContext testContext;

    public BeforeAfter(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void setup(Scenario scenario) {
        System.out.printf("Thread id : %d and Scenario : %s%n", Thread.currentThread().getId(), scenario.getName() );
        driver = DriverFactory.initializeDriver(System.getProperty("browser",ConfigLoader.getInstance().getBrowser()));
        testContext.driver = driver;
        driver.get(System.getProperty("env",ConfigLoader.getInstance().getBaseURL()));
    }

    @BeforeTest
    public void setupForTestNG(Scenario scenario) {
        setup(scenario);
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @AfterTest
    public void teardownForTestNG() {
        teardown();
    }

}
