package TestUtil;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:reports/index.html" }
        ,features = {"src/test/resources"}
        ,glue = {"commonUtils","stepDefination"}
        ,monochrome = true
)
public class RunnerTest {
}
