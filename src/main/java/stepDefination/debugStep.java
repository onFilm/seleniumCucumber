package stepDefination;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.PageInstances;

public class debugStep extends PageInstances {

    @Given("^I verify the \"([^\"]*)\" page title is displayed$")
    public void i_verify_the_something_page_title_is_displayed(String title) {
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Wrong Page Title", pageTitle.equalsIgnoreCase(title) );
    }
}
