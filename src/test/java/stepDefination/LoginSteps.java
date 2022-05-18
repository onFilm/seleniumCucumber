package stepDefination;

import commonUtils.context.TestContext;
import commonUtils.domainObjects.LoginCredential;
import commonUtils.factory.DriverFactory;
import commonUtils.factory.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    private final WebDriver driver;
    private final TestContext testContext;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
        driver = testContext.driver;
    }

    @Given("I login to SwagLabs app with username and password")
    public void i_login_to_SwagLabs_app_with_username_and_password(LoginCredential loginCredential) {
        testContext.loginCredential = loginCredential;
        PageFactoryManager.getLoginPage(driver).setUsername(testContext.loginCredential.getUsername());
        PageFactoryManager.getLoginPage(driver).setPassword(testContext.loginCredential.getPassword());
    }

    @Then("I print the credential in console")
    public void i_print_the_credential_in_console() {
        System.out.println(testContext.loginCredential);
    }
}
