package stepDefination;

import commonUtils.context.TestContext;
import commonUtils.factory.DriverFactory;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class debugStep {
    private WebDriver driver;

    public debugStep(TestContext testContext) {
        driver = testContext.driver;
    }

    @Given("I verify the {string} page title is displayed")
    public void i_verify_the_something_page_title_is_displayed(String title) {
        driver = DriverFactory.getDriver();
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Wrong Page Title", pageTitle.equalsIgnoreCase(title));
    }
}
