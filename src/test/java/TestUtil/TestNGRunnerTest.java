package TestUtil;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = { "pretty","html:reports/index.html" }
        ,features = {"src/test/resources"}
        ,glue = {"commonUtils","stepDefination"},
        publish = true
        ,monochrome = true
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
