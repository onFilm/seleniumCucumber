package stepDefination;

import commonUtils.context.TestContext;
import org.openqa.selenium.WebDriver;

public class commonSteps {
    private WebDriver driver;
    public commonSteps(TestContext testContext) {
        driver = testContext.driver;
    }
}
