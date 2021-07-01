package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PageInstances;

public class commonSteps extends PageInstances {
    @When("^I select equal to perform operation$")
    public void iSelectEqualToPerformOperation() {
        driver.findElement(page.equal).click();
    }

    @Then("^I validate the result \"([^\"]*)\" is displayed$")
    public void iValidateTheResultIsDisplayed(String result) {
        String resultNum = driver.findElement(page.resultText).getText();
        System.out.println("Result : " + resultNum);
        Assert.assertTrue("Result validation", result.equalsIgnoreCase(resultNum));
    }

    @And("^I select \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSelectNumAndOperatorAndNum(String num1, String operator, String num2) {
        driver.findElement(page.numberSelector(num1)).click();
        driver.findElement(page.operatorSelector(operator)).click();
        driver.findElement(page.numberSelector(num2)).click();
    }
}
