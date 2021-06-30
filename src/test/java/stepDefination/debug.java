package stepDefination;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import pages.Page;

public class debug extends Page {

    @Given("^I verify the \"([^\"]*)\" page title is displayed$")
    public void i_verify_the_something_page_title_is_displayed(String title) {
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Wrong Page title", pageTitle.equalsIgnoreCase(title) );
    }
}
